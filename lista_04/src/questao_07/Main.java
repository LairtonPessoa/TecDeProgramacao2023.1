package questao_07;

public class Main {

	public static void main(String[] args) {
		/*7) Crie uma implementação orientada a objetos conforme os passos abaixo:
		a) A classe Empregado deve possuir dois atributos, nome e salário. O salário
		deve ser do tipo protected. Crie os métodos get e set para classes e o método
		toString.
		b) A classe Gerente deve herdar da classe Empregado. Crie os métodos get
		e set para a classe e o método toString. O método toString da classe Gerente deve
		incluir a informação do departamento, além dos dados da superclasse. O construtor
		da classe deve receber por parâmetro, além das informações da superclasse, a
		informação do departamento.
		c) A classe Vendedor deve herdar também da classe Empregado. Deve
		possuir ainda um método denominado calcularSalario. Esse método deve retornar
		um valor do tipo float, correspondente ao valor do salário acrescido do respectivo
		percentual de comissão. O construtor da classe deve receber por parâmetro, além
		das informações da superclasse, a informação do percentual de comissão do
		vendedor. O método toString da classe deve apresentar as informações de nome do
		empregado, salário sem comissão, salário com comissão e percentual de comissão.
		d) Crie uma classe para testar objetos das classes implementadas.*/
		System.out.println("Questao 07");
		
		Gerente Lairton = new Gerente("Fco Lairton", 2500, 4);
		Vendedor Eduardo = new Vendedor("Eduardo", 1480, 0.1);
		
		System.out.println(Lairton.toString());
		System.out.println(Eduardo.toString());
		
	}

}
