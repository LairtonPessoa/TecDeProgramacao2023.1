package trabalho_01;

public abstract class Entidades  {

	protected int id;
	protected String nome;
	protected int posicaoXdaEntidade;
	protected int posicaoYdaEntidade;
	protected Plano plano;
	protected char caractere;
	protected int pontuacao;
	protected boolean visibilidade;
	
	
	public Entidades(int id, Plano plano) {
		this.id = id;
		this.plano = plano;
	}

	public void atribuirEntidadeACelula() {
		for (Celula celula : plano.listaDeCelulas) {//for para verificarmos do inicio de todas as celulas
			if(celula.posicaoXdaCelula==this.posicaoXdaEntidade&&celula.posicaoYdaCelula==this.posicaoYdaEntidade) {//aqui verificamos a celula com a posição x e y tem as mesmas cordenadas da entidade e atribuimos ela na celula correspondente
				celula.listaEntidade.add(this);
			}else {//se a minha celula não tiver as mesmas posições da entidade e tiver a entidade, ira remove-la
				celula.listaEntidade.remove(this);
			}
		}
	}
	

	public Celula getCelulaAtualDaEntidade() {
		for (Celula celula : plano.listaDeCelulas) {
			if(celula.posicaoXdaCelula==posicaoXdaEntidade&&celula.posicaoYdaCelula==posicaoYdaEntidade) {
				return celula;
			}
		}
		return null;
	}

	protected abstract boolean podeComputarPontuacao();
	
}
