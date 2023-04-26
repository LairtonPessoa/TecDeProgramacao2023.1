package questao_02;

public class Main {

	public static void main(String[] args) {
		/*2) A fim de representar empregados em uma firma, você deverá criar uma
		classe chamada Empregado. Esta classe deverá possuir as três informações
		a seguir:
		a. Um primeiro nome,
		b. Um sobrenome,
		c. Um salário mensal.
		
		Sua classe deve ter um construtor que inicializa os três atributos. Forneça um
		método set e get para cada atributo. Se o salário mensal não for positivo,
		configure-o como 0.0. Crie duas instâncias da classe e exiba o salário anual de cada
		instância. Então dê a cada empregado um aumento de 10% e exiba novamente o
		salário anual de cada empregado.*/
		System.out.println("Questao 02");
		
		Empregado empregadoA = new Empregado("Joao","Ferreira",2000.8);
		Empregado empregadoB = new Empregado("Antonio","Silva",-700);
		
		System.out.println(empregadoA.getFirstName()+" " + empregadoA.getLastName() +" "+ empregadoA.getSalarioMensal());
		System.out.println(empregadoB.getFirstName()+" " + empregadoB.getLastName() +" "+ empregadoB.getSalarioMensal());
		
		empregadoB.setSalarioMensal(1000.4);
		System.out.println(empregadoB.getSalarioMensal());
		
		System.out.println(empregadoA.getSalarioAnual());
		System.out.println(empregadoB.getSalarioAnual());
		
		empregadoA.increaseSalario(0.1);//10%=0.1
		empregadoB.increaseSalario(0.1);
		
		System.out.println(empregadoA.getSalarioAnual());
		System.out.println(empregadoB.getSalarioAnual());
	}

}
