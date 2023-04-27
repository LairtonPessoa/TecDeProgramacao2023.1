package questao_06;

public class Evento {

	private Ingressos listaDeIngressos[];
	private float valorTotalVendido;
	
	public Evento(Ingressos ingressos, IngressosVip ingressosVip) {
		listaDeIngressos = new Ingressos[2];
		listaDeIngressos[0] = ingressos;
		listaDeIngressos[1] = ingressosVip;
		valorTotalVendido=0;
	}
	
	public String venderIngresso(int quantidadeComprada) {
			if(quantidadeComprada<=listaDeIngressos[0].quantidade) {
				listaDeIngressos[0].quantidade-=quantidadeComprada;
				valorTotalVendido+=listaDeIngressos[0].valorUnitario*quantidadeComprada;
				return "Compra efetuada com sucesso: " + quantidadeComprada + "x Ingresso";
			}else {
				return "Compra nao efetuada pois os ingressos se esgotaram";
			}
		
	}
	
	public String venderIngressoVip(int quantidadeComprada) {
			if(quantidadeComprada<=listaDeIngressos[1].quantidade) {
				listaDeIngressos[1].quantidade-=quantidadeComprada;
				valorTotalVendido+=(listaDeIngressos[1].getValor()*quantidadeComprada);
				return "Compra efetuada com sucesso: " + quantidadeComprada + "x IngressoVip";
			}else {
				return "Compra nao efetuada pois os ingressosVip se esgotaram";
			}
	}
	
	public String valorTotalVendido() {
		return "O valor total vendido foi de: " + valorTotalVendido;
	}
	public String ingressosRestantes() {
		return "A quantidade de ingressos restantes foi de: " + listaDeIngressos[0].quantidade +" Ingressos | " + listaDeIngressos[1].quantidade + " IngressosVip";
	}
	
	
	
}
