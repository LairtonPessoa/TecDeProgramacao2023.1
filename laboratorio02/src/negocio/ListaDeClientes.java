package negocio;

import java.util.ArrayList;

public class ListaDeClientes {

	private ArrayList<Cliente> listaClientes;

	public ListaDeClientes() {
		listaClientes = new ArrayList<Cliente>();
		
	}
	
	public void setList(ArrayList<Cliente> lista) {
		listaClientes = lista;
	}
	public void addClienteToList(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	public int getQuantidadeDeClientes() {
		return listaClientes.size();
	}
	
	public String relatorioDeClientes() {
		String relatorio = "";
		
		for (Cliente cliente : listaClientes) {
			relatorio += "Nome: " + cliente.getName() + ";CPF: " + cliente.getCpf() + 
					";Matricula: " + cliente.getMatricula() + ";Vertente: " + cliente.getVertente() +"\n";
		}
		
		return relatorio;
	}
}
