package questao_07;

public abstract class Empregado {

	public String nome;
	protected float salario;
	
	
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = (float)salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Empregado [nome=" + nome + ", salario=" + salario + ", getNome()=" + getNome() + ", getSalario()="
				+ getSalario() + "]";
	}
	
	
	
}
