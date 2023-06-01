package trabalho_01;

import java.util.Random;

public class Bug extends Entidades{

	public Bug(int id, Plano plano) {
		super(id, plano);
		nome = "Bug";
		pontuacao = -15;
		caractere = '#';
		visibilidade = false;
		
		Random random = new Random();
		boolean controle = false;
		
		do {
			posicaoXdaEntidade = random.nextInt(plano.tamanhoX);
			posicaoYdaEntidade = random.nextInt(plano.tamanhoY);
				
			for (Celula celula : plano.listaDeCelulas) {
				if(celula.posicaoXdaCelula==posicaoXdaEntidade&&celula.posicaoYdaCelula==posicaoYdaEntidade&&celula.listaEntidade.size()==0) {
					this.atribuirEntidadeACelula();
					controle = true;
				}
			}
		}while(!controle);
	}

	
	public boolean foiAchado() {
		if(visibilidade) {
			Celula celulaDoBug = this.getCelulaAtualDaEntidade();
			celulaDoBug.listaEntidade.remove(0);
			this.visibilidade=false;
			
			for (Entidades entidade : celulaDoBug.listaEntidade) {
				if(!entidade.visibilidade)
					entidade.visibilidade=true;
				System.out.println(entidade.nome + " achou um " + this.nome);
			}
			
			return true;
		}
		return false;
	}

	
	public boolean podeComputarPontuacao() {
		return true;
	}
	
}
