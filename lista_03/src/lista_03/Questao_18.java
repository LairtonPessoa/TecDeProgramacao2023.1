package lista_03;

public class Questao_18 {

	public static double jurosCompostos(double capital,float taxa,float tempo) {
		
		double montante = capital*Math.pow(1+taxa, tempo);
		
		return montante;
	}
	public static void main(String[] args) {
		/*18)Cálculo de juros compostos: Sua função deverá receber um valor inicial,
		uma taxa de juros e um número de períodos. A função deve retornar o valor
		final após a aplicação dos juros compostos. Exemplo: 1000, 0.05, 3 ->
		1157.63*/
		System.out.println("Questao 18");
		
		double capitalInicial = 1000;
		float taxa = (float) 0.05;
		float tempo = 3;
		
		System.out.println("Com um capital inicial, tempo, taxa na mesma medida que o \ntempo e ja dividido por 100 temos o montante aplicado a juros \ncompostos com os seguintes resultados: " + capitalInicial+", "+tempo+", "+ taxa+" -> "+jurosCompostos(capitalInicial, taxa, tempo));
		
	}

}
