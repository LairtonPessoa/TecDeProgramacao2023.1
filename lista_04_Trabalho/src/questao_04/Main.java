package questao_04;

public class Main {

	public static void main(String[] args) {
		/*4) Crie um programa que tenha uma classe produto constituída de nome, preço
		e quantidade. Implemente um método chamado “comprarProduto”. Este
		método quando chamado deverá modificar uma variável do produto indicando
		que o produto foi comprado. Para cada produto informado escreva o nome do
		produto comprado e o valor total a ser pago, considerando que são
		oferecidos descontos segundo o valor do produto conforme a tabela abaixo:
		a. Até R$ 100: sem desconto
		b. De R$ 100 a R$ 200: 10% de desconto
		c. De R$ 200 a R$ 500: 20% de desconto
		d. Acima de R$500: 25% de desconto*/
		System.out.println("Questao 04");

		System.out.println("Lista de descontos em cada produto: \n-Ate R$ 100: sem desconto\n-De R$ 100 a R$ 200: 10% de desconto\n-De R$ 200 a R$ 500: 20% de desconto\n-Acima de R$500: 25% de desconto\n");
		
		Produto parTenis = new Produto("Tenis Air Force", 750.99);
		Produto monitor = new Produto("Monitor 19.5'", 350.10);
		Produto garrafa = new Produto("Garrafa tupperware", 41.90);
		Produto ventilador = new Produto("Ventilador 3 em 1", 178.9);
		
		parTenis.comprarProduto(parTenis, 1);
		monitor.comprarProduto(monitor, 2);
		garrafa.comprarProduto(garrafa, 3);
		ventilador.comprarProduto(ventilador, 1);
	}

}
