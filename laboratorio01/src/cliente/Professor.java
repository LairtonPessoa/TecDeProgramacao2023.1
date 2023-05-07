package cliente;

public class Professor extends Cliente{

	public Professor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Professor";
		this.numeroDeEmprestimosDisponiveis=10;

	}

	
	public int verificarDias() {
		return 20;
	}

	public int gastoDeTP() {
		return -25;
	}

	public float darDesconto() {
		return 0;
	}
	

}
