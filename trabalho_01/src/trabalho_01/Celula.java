package trabalho_01;

import java.util.ArrayList;

public class Celula {

	protected int posicaoXdaCelula;
	protected int posicaoYdaCelula;
	protected ArrayList<Entidades> listaEntidade;
	
	public Celula(int posicaoX, int posicaoY) {
		this.posicaoXdaCelula=posicaoX;
		this.posicaoYdaCelula=posicaoY;
		listaEntidade = new ArrayList<Entidades>();
	}
}
