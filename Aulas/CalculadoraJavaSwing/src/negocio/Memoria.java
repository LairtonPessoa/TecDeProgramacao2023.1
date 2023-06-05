package negocio;

import java.util.ArrayList;

public class Memoria {

	private ArrayList<String> numeros;

	public Memoria() {
		numeros = new ArrayList<String>();
	}

	public String getNumeros() {
		String resultado = "";

		for (String num : numeros) {
			resultado += ""+ num;
		}
		return resultado;
	}
	
	public void setNumero(String numero) {
		
		if(numero.equals("="))
			System.out.println(" igual");
		numeros.add(numero);
	}

}
