package publicacoes;

public class Livros extends Publicacoes{

	public Livros(String titulo, int anoDePublicacao, String autor, int quantidadeDisponivel) {
		super(titulo, anoDePublicacao, autor, quantidadeDisponivel);
		this.tipo="Livro";
	}

	public float porcentagemDeDesconto() {
		return (float) 0.1;
	}

}
