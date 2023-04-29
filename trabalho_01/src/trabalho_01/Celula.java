package trabalho_01;

public class Celula {

	public int posicaoXdaCelula;
	public int posicaoYdaCelula;
	public Entidade entidade;
	
	public Celula(int posicaoX, int posicaoY) {
		this.posicaoXdaCelula=posicaoX;
		this.posicaoYdaCelula=posicaoY;
		this.entidade=null;
	}
}
