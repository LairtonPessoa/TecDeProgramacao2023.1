package com.IlhaDeJava.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;



public class Leitora {

	private ArrayList<String> relatorioDasPartidas;
	
	public Leitora() {
		relatorioDasPartidas = new ArrayList<String>();

	}
	
	public void lerDadosDosClientes(String diretorio) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(diretorio));
			
			while(reader.ready()) {
				relatorioDasPartidas.add(reader.readLine());
			}
			reader.close();
		}catch(Exception e) {
			
		}
	}
	
	public ArrayList<String> getRelatorioDasPartidas(){
		return relatorioDasPartidas;
	}
	
	
	
}
