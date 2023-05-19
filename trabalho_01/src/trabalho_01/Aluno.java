package trabalho_01;

import java.util.Random;
public class Aluno extends Entidade{

	public Aluno(int id, Plano plano) {
		super(id, plano);
		pontuacao = 10;
		caractere = '@';
		this.posicaoXdaEntidade=5;
		this.posicaoYdaEntidade=5;
		visibilidade = true;
		
//		Random random = new Random();
//		
//		posicaoXdaEntidade = random.nextInt(plano.tamanhoX);
//		posicaoYdaEntidade = random.nextInt(plano.tamanhoY);
//		
		this.atribuirEntidadeACelula();
	}

	public boolean podeComputarPontuacao() {
		return true;
	}
	
}
