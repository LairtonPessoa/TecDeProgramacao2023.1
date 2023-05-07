package publicacoes;

public abstract class Publicacoes {

	protected String titulo;
	protected int anoDePublicacao;
	protected String autor;
	protected int quantidadeDisponivel;
	protected int quantidadeEmprestada;
	protected String tipo;
	
	public Publicacoes(String titulo, int anoDePublicacao, String autor, int quantidadeDisponivel) {
		this.titulo = titulo;
		this.anoDePublicacao = anoDePublicacao;
		this.autor = autor;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.quantidadeEmprestada=0;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public String getAutor() {
		return autor;
	}

	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	
	public void setQuantidadeDisponivel(int  quantidadeDisponivel) {
		this.quantidadeDisponivel=quantidadeDisponivel;
	}
	
	public String getTipo() {
		return tipo;
	}

	public int getQuantidadeEmprestada() {
		return quantidadeEmprestada;
	}

	public void setQuantidadeEmprestada(int quantidadeEmprestada) {
		this.quantidadeEmprestada = quantidadeEmprestada;
	}
	
	
	
	
	
	
	
}
