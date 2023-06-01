package trabalho_01;


public class Andador extends Robos{
	
	
	
	public Andador(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
		super(id, nome, posicaoX, posicaoY, plano);
		caractere='A';
		movimentacao = "movimenta-se na vertical quantas casas desejar no limite do plano";
		
	}
	
	
	public boolean avancar(int celulasParaAvancar) {//logica para poder diminuir o indice x da matriz para desloca-lo um determinado numero para cima
		for (Celula celula : plano.listaDeCelulas) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			for (Entidades entidade : celula.listaEntidade) {
				if(entidade==this) {
					//aqui salvamos a nova posição x onde a entidade ira se movimentar
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
	
	public boolean retroceder(int celulasParaRetroceder) {//logica para poder aumentar o indice x da matriz para desloca-lo um determinado numero para baixo
		for (Celula celula : plano.listaDeCelulas) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			for (Entidades entidade : celula.listaEntidade) {
				if(entidade==this) {
					//aqui salvamos a nova posição x onde a entidade ira se movimentar
					this.posicaoXdaEntidade+=celulasParaRetroceder;
					
					if(posicaoXdaEntidade>plano.tamanhoX) {
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
