package cliente;

public class Aluno extends Cliente {

	public Aluno(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Aluno";
		this.numeroDeEmprestimosDisponiveis=5;
	}

	
	public int verificarDias() {
		return 10;
	}

	public int gastoDeTP() {
		return -10;
	}

	public float darDesconto() {
		return 1;
	}

}
