package trabalho_01;

import java.util.ArrayList;

public class Celula {

	public int posicaoXdaCelula;
	public int posicaoYdaCelula;
	public ArrayList<Entidade> listaEntidade;
	
	public Celula(int posicaoX, int posicaoY) {
		this.posicaoXdaCelula=posicaoX;
		this.posicaoYdaCelula=posicaoY;
		listaEntidade = new ArrayList<Entidade>();
	}
}
