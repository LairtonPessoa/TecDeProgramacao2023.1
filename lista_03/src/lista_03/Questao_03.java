package lista_03;

public class Questao_03 {

	public static float mediaPonderada(float numeros[], float pesos[]) {
	 float soma=0, pesoTotal=0;
	 
	 for(int i=0;i<numeros.length;i++) {
		 soma+=numeros[i]*pesos[i];
		 pesoTotal+=pesos[i];
	 }
	 return soma/pesoTotal;
	}
	
	public static void main(String[] args) {
		/*3) Média ponderada: Sua função deverá receber um vetor de notas e um vetor
		de pesos correspondentes. A função deve retornar a média ponderada das
		notas. Exemplo: [7, 8, 6], [2, 3, 1] -> 7.33*/
		System.out.println("Questao 03");
		
		float notas[] = {7,8,6};
		float pesos[] = {2,3,1};
		
		
		System.out.println("A media ponderada das notas eh: "+mediaPonderada(notas,pesos));

	}

}
