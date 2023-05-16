package questao_18;

public abstract class Entidade implements ValidarMovimentacao{

	protected Plano plano;
	protected int posicaoX;
	protected int posicaoY;
	protected int id;
	
	public Entidade(int id, Plano plano) {
		this.id=id;
		this.plano=plano;
	}
	
	
}
