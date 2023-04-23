package questao_03;

public class Main {

	public static void main(String[] args) {
		/*3) Crie uma classe chamada Fatura que possa ser utilizada por uma loja de
		suprimentos de informática para representar uma fatura de um item vendido
		na loja. Uma fatura deve incluir as seguintes informações como atributos:
		a. O número do item faturado
		b. A descrição do item
		c. A quantidade comprada do item
		d. O preço unitário do item.
		e. Preço total da fatura
		
		Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade
		não for positiva, ela deve ser configurada como 0. Se o preço por item não for
		positivo ele deve ser configurado como 0.0. Forneça um método set e um método
		get para cada variável de instância. Além disso, forneça um método chamado
		getValorFatura que calcula o valor da fatura (isso é, multiplicar a quantidade pelo
		preço por item) e depois retorna o valor como um double. Crie um método que
		possa dar descontos em todos os itens, o porcentagem de desconto deverá ser
		informado para o método.*/
		System.out.println("Questao 03");
		
		Item ssd = new Item(17400, "SSD", 1, 250);
		Item foneDeOuvido = new Item(1211, "Fone de Ouvido", 5, 12.5);
		
		Fatura fatura = new Fatura();
		fatura.addItemToFatura(ssd);
		fatura.addItemToFatura(foneDeOuvido);

		System.out.println(fatura.getValorFatura());
		
		System.out.println(fatura.descontoFatura(0.1));
		
		
	}

}
