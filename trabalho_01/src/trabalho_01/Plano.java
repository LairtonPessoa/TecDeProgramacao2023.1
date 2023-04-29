package trabalho_01;

import java.util.ArrayList;


public class Plano {

	public ArrayList<Celula> listaDeCelulas;
	
	public Plano(int tamanhoX, int tamanhoY) {
		listaDeCelulas = new ArrayList<Celula>();
		
		for (int i = 1; i <= tamanhoX; i++) {
			for (int j = 1; j <= tamanhoY; j++) {
				Celula celula = new Celula(i, j);
				listaDeCelulas.add(celula);
			}
		}
	}
}
