package trabalho_01;

public abstract class Entidade {

	public int id;
	public String nome;
	public int posicaoXdaEntidade;
	public int posicaoYdaEntidade;
	public Plano plano;
	
	public Entidade(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
		super();
		this.id = id;
		this.nome = nome;
		this.posicaoXdaEntidade = posicaoX;
		this.posicaoYdaEntidade = posicaoY;
		this.plano = plano;
		
		Celula aux = null;
		for(int i=0;i<plano.listaDeCelulas.size();i++) {
			aux = plano.listaDeCelulas.get(i);
			if(aux.posicaoXdaCelula==posicaoX && aux.posicaoYdaCelula==posicaoY) {
				aux.entidade=this;
			}
		}
		
		
		
		
	}

	//public abstract void avancarNoPlano(int numeroDeCelulasParaAvancar);

	//public abstract void retrocederNoPlano(int numeroDeCelulasParaRetroceder);

	
}
