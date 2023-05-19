package trabalho_01;

import java.util.ArrayList;


public class Plano {

	protected ArrayList<Celula> listaDeCelulas;
	protected int tamanhoX;
	protected int tamanhoY;
	
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
				if(celula.listaEntidade.get(celula.listaEntidade.size()-1).visibilidade) {
					System.out.print("[" + celula.listaEntidade.get(celula.listaEntidade.size()-1).caractere + "]   ");
				}else if(celula.listaEntidade.get(0).visibilidade){
					System.out.print("[" + celula.listaEntidade.get(0).caractere + "]   ");
				}else {
					System.out.print("[ ]   ");
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

