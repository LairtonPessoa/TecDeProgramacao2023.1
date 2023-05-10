package publicacoes;

public class TCC extends Publicacoes{

	public TCC(String titulo, int anoDePublicacao, String autor, int quantidadeDisponivel) {
		super(titulo, anoDePublicacao, autor, quantidadeDisponivel);
		this.tipo="TCC";
	}

	
	public float porcentagemDeDesconto() {
		return (float) 0;
	}

}
