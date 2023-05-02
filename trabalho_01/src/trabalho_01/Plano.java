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
		for (int i = 0; i < listaDeCelulas.size(); i++) {
			if(listaDeCelulas.get(i).entidade!=null&&listaDeCelulas.get(i).entidade.getClass()==RoboAndador.class) {
				System.out.print("[A]   ");
			}if(listaDeCelulas.get(i).entidade!=null&&listaDeCelulas.get(i).entidade.getClass()==Peao.class) {
				System.out.print("[P]   ");
			}if(listaDeCelulas.get(i).entidade==null) {
				System.out.print("[ ]   ");
			}
			if(listaDeCelulas.get(i).posicaoYdaCelula%tamanhoY==0) {
				System.out.println("\n");
			}
			
		}
	}
}

