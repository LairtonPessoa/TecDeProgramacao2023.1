package questao_07;

public class Vendedor extends Empregado{

	public float percentualDeComissao;
	
	public Vendedor(String nome, double salario, double percentualDeComissao) {
		super(nome, salario);
		this.percentualDeComissao=(float)percentualDeComissao;
	}

	
	public String toString() {
		return "Vendedor [nome=" + nome +", salario sem comissao=" + salario + ", salario com comissao="+ (salario+(salario*percentualDeComissao)) + ", percentual de comissao=" +percentualDeComissao
				+ "]";
	}

	
}
