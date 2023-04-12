package lista_03;

public class Questao_02 {
	public static float media(float valores1[], float valores2[]) {
		float soma=0;
		
		for (int i = 0; i < valores1.length; i++) 
			soma+=valores1[i];
		for (int j = 0; j < valores2.length; j++)
			soma+=valores2[j];
		
		return soma/(valores1.length+valores2.length);
	}
	public static void main(String[] args) {
		/*2) Média: Sua função deverá receber dois vetores como entrada e retornar a
		média dos valores presentes nos vetores.*/	
		System.out.println("Questao 02");
		
		float valoresA[]= {7,10,5};
		float valoresB[]= {3,4,-8};
		
		System.out.println("A media dos vetores A e B eh: "+media(valoresA,valoresB));
		
	}

}
