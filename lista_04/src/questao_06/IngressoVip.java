package questao_06;

public class IngressoVip extends Ingresso {

	public float valorAdicional=5;
	
	public String ingressoToString() {
		return this.ingressoToString()+valorAdicional;
	}
}
