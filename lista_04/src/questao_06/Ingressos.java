package questao_06;

public class Ingressos {

	protected float valorUnitario;
	protected int quantidade;
	
	public Ingressos(double valorUnitario, int quantidade) {
		this.valorUnitario=(float)valorUnitario;
		this.quantidade=quantidade;
	}

	public float getValor() {
		return valorUnitario;
	}
	public String ingressoToString() {
		return "O valor do Ingresso eh: " + valorUnitario;
	}
}
