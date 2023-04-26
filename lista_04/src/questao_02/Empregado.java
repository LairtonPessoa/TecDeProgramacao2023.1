package questao_02;

public class Empregado {

	private String primeiroNome;
	private String sobrenome;
	private float salarioMensal;
	private float salarioAnual;
	
	public Empregado(String firstName, String lastName, double salarioMensal) {
		primeiroNome=firstName;
		sobrenome=lastName;
		if(salarioMensal<0) 
			this.salarioMensal=0;
		else
			this.salarioMensal=(float) salarioMensal;
	}
	
	public void setFirstName(String firstName) {
		primeiroNome=firstName;
	}
	
	public String getFirstName() {
		return primeiroNome;
	}
	
	public void setLastName(String LastName) {
		sobrenome=LastName;
	}
	
	public String getLastName() {
		return sobrenome;
	}
	
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal=(float) salarioMensal;
	}
	
	public float getSalarioMensal() {
		return salarioMensal; 
	}
	
	public float getSalarioAnual() {
		salarioAnual=12*salarioMensal;
		return salarioAnual;
	}
	
	public float increaseSalario(double porcentagem) {
		salarioMensal+=(salarioMensal*porcentagem);
		return salarioMensal;
	}
}
