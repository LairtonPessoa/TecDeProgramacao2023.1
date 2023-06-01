package trabalho_01;

public class Torre extends Robos {

	public Torre(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
		super(id, nome, posicaoX, posicaoY, plano);
		caractere = 'T';
		movimentacao = "movimenta-se na vertical ate 2 casas";
	}

	public boolean avancar(int celulasParaAvancar) {
		if(celulasParaAvancar<1||celulasParaAvancar>2)
			return false;
		
		for (Celula celula : plano.listaDeCelulas) {
			for (Entidades entidade : celula.listaEntidade) {
				if(entidade==this) {
					this.posicaoXdaEntidade-=celulasParaAvancar;
					
					if(this.posicaoXdaEntidade<1) {
						this.posicaoXdaEntidade+=celulasParaAvancar;
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
		if(celulasParaRetroceder<1||celulasParaRetroceder>2)
			return false;
		
		for (Celula celula : plano.listaDeCelulas) {
			for (Entidades entidade : celula.listaEntidade) {
				if(entidade==this) {
					this.posicaoXdaEntidade+=celulasParaRetroceder;
					
					if(this.posicaoXdaEntidade>plano.tamanhoX) {
						this.posicaoXdaEntidade-=celulasParaRetroceder;
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
