package persistencia;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	private FileWriter writer;
	public void writeData(String file, String mensagem, boolean append) {

		try {
			writer = new FileWriter(file, append);
			writer.write(mensagem);
			writer.close();
		} catch (Exception e) {
		}
	}
	
	
}
