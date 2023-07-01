package com.IlhaDeJava.Model;

import java.io.FileWriter;

public class Escritor {

	private FileWriter writer;
	
	public void writeData(String file, String mensagem) {

		try {
			writer = new FileWriter(file, true);
			writer.write(mensagem);
			writer.close();
		} catch (Exception e) {
		}
	}
	
	
}
