package questao_18;

public class Celula {

	protected int posicaoXDaCelula;
	protected int posicaoYDaCelula;
	protected Robo robo;
	protected Moeda moeda;
	protected String stringDaCelula;
	
	public Celula(int posicaoXDaCelula, int posicaoYDaCelula) {
		this.posicaoXDaCelula=posicaoXDaCelula;
		this.posicaoYDaCelula=posicaoYDaCelula;
		robo=null;
		moeda=null;
		stringDaCelula = "[ ]";
	}
	
	public boolean temRobo() {
		if(this.robo!=null) {
			stringDaCelula="[R]";
			return true;
		}
		return false;
	}
	
	public boolean temMoeda() {
		if(this.moeda!=null)
			return true;
		return false;
	}
	
}
