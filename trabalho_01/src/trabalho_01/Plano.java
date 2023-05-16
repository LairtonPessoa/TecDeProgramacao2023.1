package trabalho_01;

import java.util.ArrayList;


public class Plano {

	public ArrayList<Celula> listaDeCelulas;
	public int tamanhoX;
	public int tamanhoY;
	
	public Plano(int tamanhoX, int tamanhoY) {
		listaDeCelulas = new ArrayList<Celula>();
		this.tamanhoX=tamanhoX;
		this.tamanhoY=tamanhoY;
		
		for (int i = 1; i <= tamanhoX; i++) {
			for (int j = 1; j <= tamanhoY; j++) {
				Celula celula = new Celula(i, j);
				listaDeCelulas.add(celula);
			}
		}
	}
	
	public void exibirPlano() {
		for (Celula celula : listaDeCelulas) {
			if(celula.listaEntidade.size()!=0) {
				if(celula.listaEntidade.get(celula.listaEntidade.size()-1)!=null) {
					System.out.print("[" + celula.listaEntidade.get(celula.listaEntidade.size()-1).caractere + "]   ");
				}
			}else {
				System.out.print("[ ]   ");
			}
			if(celula.posicaoYdaCelula%tamanhoY==0) {
				System.out.println("\n");
			}
		}
	}
}

