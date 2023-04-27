package questao_06;

public class IngressosVip extends Ingressos {

	public float valorAdicional;
	public float valor;
	
	public IngressosVip(double valorAdicional, double valorUnitario, int quantidade) {
		super((float)valorUnitario,quantidade);
		this.valorAdicional=(float)valorAdicional;
		valor=this.valorUnitario+this.valorAdicional;
	}
	public float getValor() {
		return valor;
	}
	public String ingressoToString() {
		return "O valor do IngressoVip eh: " + valor; 
	}
}
