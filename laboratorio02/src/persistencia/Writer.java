package persistencia;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	private FileWriter writer;
	
	public Writer() {
	}
	 
	public void writeData(String diretorio, String msg) {
		try {
			
			writer = new FileWriter(diretorio);
			writer.write(msg);
			writer.close();
			
		} catch (IOException e) {
			
		}
	}
}
