package questao_02;

public class Empregado {

	private String primeiroNome;
	private String sobrenome;
	private double salarioMensal;
	private double salarioAnual;
	
	public Empregado(String firstName, String lastName, double salarioMensal) {
		primeiroNome=firstName;
		sobrenome=lastName;
		if(salarioMensal<0) 
			this.salarioMensal=0;
		else
			this.salarioMensal=salarioMensal;
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
		this.salarioMensal=salarioMensal;
	}
	
	public double getSalarioMensal() {
		return salarioMensal; 
	}
	
	public double getSalarioAnual() {
		salarioAnual=12*salarioMensal;
		return salarioAnual;
	}
	
	public double increaseSalario(double porcentagem) {
		salarioMensal+=(salarioMensal*porcentagem);
		return salarioMensal;
	}
}
