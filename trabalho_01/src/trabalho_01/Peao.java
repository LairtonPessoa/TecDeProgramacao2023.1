package trabalho_01;

public class Peao extends Robos{

	public Peao(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
		super(id, nome, posicaoX, posicaoY, plano);
		caractere='P';
		movimentacao = "movimenta-se na horizontal somente 1 casa";
		
	}

	
	public boolean avancar(int celulasParaAvancar) {//logica para poder diminuir o indice x da matriz para desloca-lo um determinado numero para cima
		if(celulasParaAvancar!=1)
			return false;
		
		for (Celula celula : plano.listaDeCelulas) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			for (Entidades entidade : celula.listaEntidade) {
				if(entidade==this) {
					this.posicaoYdaEntidade+=celulasParaAvancar;
					
					if(posicaoYdaEntidade>plano.tamanhoY) {
						this.posicaoYdaEntidade-=celulasParaAvancar;	
						return false;
					}
				}
			}
		}
		this.atribuirEntidadeACelula();
		this.computarPontuacao(getCelulaAtualDaEntidade());
		return true;
		
	}
	
	public boolean retroceder(int celulasParaRetroceder) {//logica para poder aumentar o indice x da matriz para desloca-lo um determinado numero para baixo
		if(celulasParaRetroceder!=1)
			return false;
		
		for (Celula celula : plano.listaDeCelulas) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			for (Entidades entidade : celula.listaEntidade) {
				if(entidade==this) {
					//aqui salvamos a nova posição x onde a entidade ira se movimentar
					this.posicaoYdaEntidade-=celulasParaRetroceder;
					
					if(posicaoYdaEntidade<1) {
						this.posicaoYdaEntidade+=celulasParaRetroceder;
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
