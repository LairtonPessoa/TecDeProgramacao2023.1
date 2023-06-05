package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import negocio.Cliente;
import negocio.ListaDeClientes;

public class Reader {

	private ListaDeClientes listaDeClientes;
	
	public Reader() {
		listaDeClientes = new ListaDeClientes();
	}
	
	public void lerDadosDosClientes(String diretorio) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(diretorio));
			
			while(reader.ready()) {
				listaDeClientes.addClienteToList(separarClientes(reader.readLine()));
			}
			
			reader.close();
		}catch(Exception e) {
			
		}
	}
	
	public ListaDeClientes getListaDeClientes() {
		return listaDeClientes;
	}
	
	
	
	private Cliente separarClientes(String linha) {
		String dadosAux[] = linha.split(";");
		
		return new Cliente(dadosAux[0], Integer.parseInt(dadosAux[1]), Integer.parseInt(dadosAux[2]), dadosAux[3]);
	}
	
	
}
