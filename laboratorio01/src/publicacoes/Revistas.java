package publicacoes;

public class Revistas extends Publicacoes{

	public Revistas(String titulo, int anoDePublicacao, String autor, int quantidadeDisponivel) {
		super(titulo, anoDePublicacao, autor, quantidadeDisponivel);
		this.tipo="Revista";
	}

}
