package cliente;



public abstract class Cliente implements ValidarEmprestimo, GastarTP, Desconto{

	protected int matricula;
	protected String nome;
	protected float TPs;
	protected String tipo;
	protected int numeroDeEmprestimosDisponiveis;
	
	public Cliente(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		TPs = 0;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public float getTPs() {
		return TPs;
	}
	
	public void setTPs(float num) {
		TPs=num;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumeroDeEmprestimosDisponiveis() {
		return numeroDeEmprestimosDisponiveis;
	}

	public void setNumeroDeEmprestimosDisponiveis(int numeroDeEmprestimosDisponiveis) {
		this.numeroDeEmprestimosDisponiveis = numeroDeEmprestimosDisponiveis;
	}
	
	
	
}
