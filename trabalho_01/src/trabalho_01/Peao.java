package trabalho_01;

public class Peao extends Entidade{

	public Peao(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
		super(id, nome, posicaoX, posicaoY, plano);
		// TODO Auto-generated constructor stub
	}

	
	public void avancarNoPlano() {
		for(int indiceDaCelula=0;indiceDaCelula<plano.listaDeCelulas.size();indiceDaCelula++) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			if(plano.listaDeCelulas.get(indiceDaCelula).entidade!=null&&plano.listaDeCelulas.get(indiceDaCelula).entidade==this) {
				plano.listaDeCelulas.get(indiceDaCelula).entidade=null;
				 
				//aqui salvamos a nova posição x onde a entidade ira se movimentar
				this.posicaoYdaEntidade=(plano.listaDeCelulas.get(indiceDaCelula).posicaoYdaCelula)+1;	
			}	
		}
		
		for(int i=0;i<plano.listaDeCelulas.size();i++) {//for para verificarmos do inicio de todas as celular
			if(plano.listaDeCelulas.get(i).posicaoYdaCelula==this.posicaoYdaEntidade && plano.listaDeCelulas.get(i).posicaoXdaCelula==this.posicaoXdaEntidade) {
				plano.listaDeCelulas.get(i).entidade=this;
				//aqui verificamos a celula com a posição x e y tem as mesmas cordenadas do robo e atribuimos o robo na celula correspondente
			}
		}
		
	}

	
	public void retrocederNoPlano() {
		for(int indiceDaCelula=0;indiceDaCelula<plano.listaDeCelulas.size();indiceDaCelula++) {//aqui determinamos a celula onde tinha anteriomente o robo e excluimos ele desta celula
			if(plano.listaDeCelulas.get(indiceDaCelula).entidade!=null&&plano.listaDeCelulas.get(indiceDaCelula).entidade==this) {
				plano.listaDeCelulas.get(indiceDaCelula).entidade=null;
				 
				//aqui salvamos a nova posição x onde a entidade ira se movimentar
				this.posicaoYdaEntidade=(plano.listaDeCelulas.get(indiceDaCelula).posicaoYdaCelula)-1;	
			}	
		}
		
		for(int i=0;i<plano.listaDeCelulas.size();i++) {//for para verificarmos do inicio de todas as celular
			if(plano.listaDeCelulas.get(i).posicaoYdaCelula==this.posicaoYdaEntidade && plano.listaDeCelulas.get(i).posicaoXdaCelula==this.posicaoXdaEntidade) {
				plano.listaDeCelulas.get(i).entidade=this;
				//aqui verificamos a celula com a posição x e y tem as mesmas cordenadas do robo e atribuimos o robo na celula correspondente
			}
		}
		
		
	}

}
