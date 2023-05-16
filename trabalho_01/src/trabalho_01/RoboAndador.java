package trabalho_01;

public class RoboAndador extends Entidade{

	//robo andador so se move no eixo y, para cima ou baixo quantas posições desejar
	
	
	
	public RoboAndador(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
		super(id, nome, posicaoX, posicaoY, plano);
		caractere='A';
		
	}
	
//	public String verificarOndeTemRobo() {
//		for (int i = 0; i < plano.listaDeCelulas.size(); i++) {
//			if(plano.listaDeCelulas.get(i).entidade!=null&&plano.listaDeCelulas.get(i).entidade==this) {
//				return "Celula x: " + plano.listaDeCelulas.get(i).posicaoXdaCelula + " y: " + plano.listaDeCelulas.get(i).posicaoYdaCelula + " Tem Robo";
//			}
//		}
//		return null;
//	}

	
	public void avancarNoPlano(int numeroDeCelulasParaAvancar) {//logica para poder diminuir o indice x da matriz para desloca-lo um determinado numero para cima
		for (Celula celula : plano.listaDeCelulas) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			for (Entidade entidade : celula.listaEntidade) {
				if(entidade==this) {
					//aqui salvamos a nova posição x onde a entidade ira se movimentar
					this.posicaoXdaEntidade=celula.posicaoXdaCelula-numeroDeCelulasParaAvancar;
					
					if(this.posicaoXdaEntidade<1) 
						this.posicaoXdaEntidade=1;
				}
			}
		}
		
		for (Celula celula : plano.listaDeCelulas) {//for para verificarmos do inicio de todas as celular
			if(celula.posicaoXdaCelula==this.posicaoXdaEntidade&&celula.posicaoYdaCelula==this.posicaoYdaEntidade) {//aqui verificamos a celula com a posição x e y tem as mesmas cordenadas do robo e atribuimos o robo na celula correspondente
				celula.listaEntidade.add(this);
			}else {//se a minha celula não tiver as mesmas posições do robo e tiver o robo, ira remove-lo
				celula.listaEntidade.remove(this);
			}
		}
	}
	
	public void retrocederNoPlano(int numeroDeCelulasParaAvancar) {//logica para poder aumentar o indice x da matriz para desloca-lo um determinado numero para baixo
		for (Celula celula : plano.listaDeCelulas) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			for (Entidade entidade : celula.listaEntidade) {
				if(entidade==this) {
					//aqui salvamos a nova posição x onde a entidade ira se movimentar
					this.posicaoXdaEntidade=celula.posicaoXdaCelula+numeroDeCelulasParaAvancar;
					
					if(posicaoXdaEntidade>plano.tamanhoX)
						this.posicaoXdaEntidade=plano.tamanhoX;
				}
			}
			
		}
		
		for (Celula celula : plano.listaDeCelulas) {//for para verificarmos do inicio de todas as celular
			if(celula.posicaoXdaCelula==this.posicaoXdaEntidade&&celula.posicaoYdaCelula==this.posicaoYdaEntidade) {//aqui verificamos a celula com a posição x e y tem as mesmas cordenadas do robo e atribuimos o robo na celula correspondente
				celula.listaEntidade.add(this);
			}else {//se a minha celula não tiver as mesmas posições do robo e tiver o robo, ira remove-lo
				celula.listaEntidade.remove(this);
			}
		}
	}
	
	

}
