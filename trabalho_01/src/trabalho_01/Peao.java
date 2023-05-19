package trabalho_01;

public class Peao extends Entidade{

	public Peao(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
		super(id, nome, posicaoX, posicaoY, plano);
		caractere='P';
		
	}

	
	public void avancarNoPlano() {//logica para poder diminuir o indice x da matriz para desloca-lo um determinado numero para cima
		for (Celula celula : plano.listaDeCelulas) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			for (Entidade entidade : celula.listaEntidade) {
				if(entidade==this) {
					//aqui salvamos a nova posição x onde a entidade ira se movimentar
					this.posicaoYdaEntidade=celula.posicaoYdaCelula+1;
					
					if(posicaoYdaEntidade>plano.tamanhoY)
						posicaoYdaEntidade=plano.tamanhoY;
				}
			}
		}
		this.atribuirEntidadeACelula();
		this.computarPontuacao(getCelulaAtualDaEntidade());
		
	}
	
	public void retrocederNoPlano() {//logica para poder aumentar o indice x da matriz para desloca-lo um determinado numero para baixo
		for (Celula celula : plano.listaDeCelulas) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			for (Entidade entidade : celula.listaEntidade) {
				if(entidade==this) {
					//aqui salvamos a nova posição x onde a entidade ira se movimentar
					this.posicaoYdaEntidade=celula.posicaoYdaCelula-1;
					
					if(posicaoYdaEntidade<1)
						posicaoYdaEntidade=1;
				}
			}
		}
		this.atribuirEntidadeACelula();
		this.computarPontuacao(getCelulaAtualDaEntidade());
		
	}

	public boolean podeComputarPontuacao() {
		return false;
	}


	
	

}
