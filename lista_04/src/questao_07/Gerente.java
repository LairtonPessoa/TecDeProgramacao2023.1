package questao_07;

public class Gerente extends Empregado{

	private int departamento;
	
	
	public Gerente(String nome, double salario, int departamento) {
		super(nome, salario);
		this.departamento=departamento;
		
	}
	
	public String getNome() {
		return super.getNome();
	}

	public void setNome(String nome) {
		super.setNome(nome);
	}

	public float getSalario() {
		return super.getSalario();
	}

	public void setSalario(float salario) {
		super.setSalario(salario);
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + ", departamento=" + departamento + "]";
	}

	
}
