package trabalho_01;

public class RoboAndador extends Entidade{

	//robo andador so se move no eixo y, para cima ou baixo quantas posições desejar
	
	
	
	public RoboAndador(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
		super(id, nome, posicaoX, posicaoY, plano);
		
	}
	
	public String verificarOndeTemRobo() {
		for (int i = 0; i < plano.listaDeCelulas.size(); i++) {
			if(plano.listaDeCelulas.get(i).entidade!=null) {
				return "Celula x: " + plano.listaDeCelulas.get(i).posicaoXdaCelula + " y: " + plano.listaDeCelulas.get(i).posicaoYdaCelula + " Tem Robo";
			}
		}
		return null;
	}

	
	public void avancarNoPlano(int numeroDeCelulasParaAvancar) {//logica para poder diminuir o indice x da matriz para desloca-lo um determinado numero para cima
		for(int indiceDaCelula=0;indiceDaCelula<plano.listaDeCelulas.size();indiceDaCelula++) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			if(plano.listaDeCelulas.get(indiceDaCelula).entidade!=null) {
				plano.listaDeCelulas.get(indiceDaCelula).entidade=null;
				 
				//aqui salvamos a nova posição x onde a entidade ira se movimentar
				this.posicaoXdaEntidade=(plano.listaDeCelulas.get(indiceDaCelula).posicaoXdaCelula)-numeroDeCelulasParaAvancar;
				
			}
			
		}
		for(int i=0;i<plano.listaDeCelulas.size();i++) {//for para verificarmos do inicio de todas as celular
			if(plano.listaDeCelulas.get(i).posicaoXdaCelula==this.posicaoXdaEntidade && plano.listaDeCelulas.get(i).posicaoYdaCelula==this.posicaoYdaEntidade) {
				plano.listaDeCelulas.get(i).entidade=this;
				//aqui verificamos a celula com a posição x e y tem as mesmas cordenadas do robo e atribuimos o robo na celula correspondente
			}
		}
		
	}

	public void retrocederNoPlano(int numeroDeCelulasParaRetroceder) {//mesma logica utilizada para avancar, porem para desloca-lo um determinado numero para baixo de acordo com o indice x da matriz aumentando-o
		for(int indiceDaCelula=0;indiceDaCelula<plano.listaDeCelulas.size();indiceDaCelula++) {
			if(plano.listaDeCelulas.get(indiceDaCelula).entidade!=null) {
				plano.listaDeCelulas.get(indiceDaCelula).entidade=null;
				this.posicaoXdaEntidade=(plano.listaDeCelulas.get(indiceDaCelula).posicaoXdaCelula)+numeroDeCelulasParaRetroceder;
				
			}
			
		}
		for(int i=0;i<plano.listaDeCelulas.size();i++) {
			if(plano.listaDeCelulas.get(i).posicaoXdaCelula==this.posicaoXdaEntidade && plano.listaDeCelulas.get(i).posicaoYdaCelula==this.posicaoYdaEntidade) {
				plano.listaDeCelulas.get(i).entidade=this;
		/*HA UM ERRO LOGICO AQUI PARA RESOLVER, ESTE FOR SO DEVE EXECUTAR QUANDO O IF TERMINAR*/
			}
		}
		
	}
	
	

}
