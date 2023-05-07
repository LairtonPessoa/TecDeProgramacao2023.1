package cliente;

public class Servidor extends Cliente{

	public Servidor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Servidor";
		this.numeroDeEmprestimosDisponiveis=7;
		
	}

	
	public int verificarDias() {
		return 15;
	}

	public int gastoDeTP() {
		return -15;
	}

	public float darDesconto() {
		return 0;
	}

	
}

