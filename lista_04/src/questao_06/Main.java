package questao_06;

public class Main {

	public static void main(String[] args) {
		/*6) Crie uma implementação orientada a objetos conforme os passos abaixo:
		a) Crie uma classe chamada Ingresso que possua um atributo valor e um
		método toString que retorne à informação do valor do ingresso.
		b) Crie uma classe IngressoVIP, que herda de Ingresso e possui um atributo
		valor Adicional. O método toString da classe IngressoVIP deve considerar que o
		valor do ingresso é o valor da superclasse somado ao valor Adicional do
		IngressoVIP.
		c) Crie uma classe evento que é composta de uma lista ingresso.
		d) Crie um método para possibilitar uma venda de um determinado ingresso
		e) Crie um método para computar o valor total dos ingressos vendidos
		f) Crie um método que permita mostrar os ingressos que não foram vendidos
		c) Crie uma classe para testar os objetos das classes Ingresso e IngressoVIP*/
		System.out.println("Questao 06");
		Ingressos ingressoPadrao = new Ingressos(15.5, 20);
		IngressosVip ingressosVips = new IngressosVip(7.5, ingressoPadrao.valorUnitario, 15);
		
		System.out.println(ingressoPadrao.ingressoToString());
		System.out.println(ingressosVips.ingressoToString());
		
		Evento show = new Evento(ingressoPadrao, ingressosVips);
		
		System.out.println(show.ingressosRestantes());
		
		show.venderIngresso(4);
		show.venderIngressoVip(7);
		
		System.out.println(show.ingressosRestantes());
		System.out.println(show.valorTotalVendido());
		
		
		
		

	}

}
