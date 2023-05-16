package questao_17;

public class Jogadores {

	protected String nomeJogador1;
	protected String nomeJogador2;
	private Plano plano;
	
	public Jogadores(String jogador1, String jogador2, Plano plano){
		this.nomeJogador1=jogador1;
		this.nomeJogador2=jogador2;
		this.plano=plano;
	}
	
	public boolean jogar(int posicaoX, int posicaoY, String simbolo) {
		if(plano.grade[posicaoX][posicaoY]==null) {
			plano.grade[posicaoX][posicaoY]=simbolo;
			return true;
		}else {
			System.out.println("Essa posicao ja foi ocupada");
			return false;
		}
			
	}
	
	
}
