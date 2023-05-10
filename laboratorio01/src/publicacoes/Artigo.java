package publicacoes;

public class Artigo extends Publicacoes{

	public Artigo(String titulo, int anoDePublicacao, String autor, int quantidadeDisponivel) {
		super(titulo, anoDePublicacao, autor, quantidadeDisponivel);
		this.tipo="Artigo";
	}

	
	public float porcentagemDeDesconto() {
		return (float) 0.5;
	}

}
