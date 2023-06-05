package negocio;

public class Cliente {

	private String name;
	private int cpf;
	private int matricula;
	private String vertente;
	
	
	public Cliente(String name, int cpf, int matricula, String vertente) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.matricula = matricula;
		this.vertente = vertente;
	}


	public String getVertente() {
		return vertente;
	}


	public void setVertente(String vertente) {
		this.vertente = vertente;
	}


	public String getName() {
		return name;
	}


	public int getCpf() {
		return cpf;
	}


	public int getMatricula() {
		return matricula;
	}
	
	
	
}
