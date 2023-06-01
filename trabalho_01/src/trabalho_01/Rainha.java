package trabalho_01;

public class Rainha extends Robos {

	public Rainha(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
		super(id, nome, posicaoX, posicaoY, plano);
		caractere = 'Q';
		movimentacao = "possui mesmo movimento do Robo Bispo porem ate 4 casas";
	}

	public boolean avancar(int celulasParaAvancar) {
		if(celulasParaAvancar<1||celulasParaAvancar>4)
			return false;
		
		for (Celula celula : plano.listaDeCelulas) {
			for (Entidades entidade : celula.listaEntidade) {
				if(entidade==this) {
					this.posicaoXdaEntidade-=celulasParaAvancar;
					this.posicaoYdaEntidade-=celulasParaAvancar;
					
					if(this.posicaoXdaEntidade<1||this.posicaoYdaEntidade<1) {
						this.posicaoXdaEntidade+=celulasParaAvancar;
						this.posicaoYdaEntidade+=celulasParaAvancar;
					
						return false;
					}
				}
			}
		}
		this.atribuirEntidadeACelula();
		this.computarPontuacao(getCelulaAtualDaEntidade());
		return true;
	}

	public boolean retroceder(int celulasParaRetroceder) {
		if(celulasParaRetroceder<1||celulasParaRetroceder>4)
			return false;
		
		for (Celula celula : plano.listaDeCelulas) {
			for (Entidades entidade : celula.listaEntidade) {
				if(entidade==this) {
					this.posicaoXdaEntidade+=celulasParaRetroceder;
					this.posicaoYdaEntidade+=celulasParaRetroceder;
					
					if(this.posicaoXdaEntidade>plano.tamanhoX||this.posicaoYdaEntidade>plano.tamanhoY) {
						this.posicaoXdaEntidade-=celulasParaRetroceder;
						this.posicaoYdaEntidade-=celulasParaRetroceder;
						
						return false;
					}
						
				}
			}
		}
		this.atribuirEntidadeACelula();
		this.computarPontuacao(getCelulaAtualDaEntidade());
		return true;
	}
	
	public boolean podeComputarPontuacao() {
		return false;
	}

}
