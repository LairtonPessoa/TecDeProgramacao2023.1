package lista_03;

public class Questao_07 {

	public static boolean verificarVetorCrescente(int vetor[]) {
		boolean teste = true;
		int vetAuxiliar[] = new int[vetor.length];
		for (int i = 0; i < vetAuxiliar.length; i++) {//copia o vetor para uma auxiliar
			vetAuxiliar[i] = vetor[i];
		}
		
		
		for(int i = 0;i<vetor.length;i++) {//trecho de codigo pego como referencia da questao 06 liista 03
			for(int j=i;j<vetor.length;j++) {
				if(vetor[i]>vetAuxiliar[j]) {
					teste = false;
				}
			}
		}
		return teste;
	}
	
	public static void main(String[] args) {
		/*7) Verificação de ordenação: Sua função deverá receber um vetor e verificar
		se ele está ordenado em ordem crescente. Se sim retornar true.*/
		System.out.println("Questao 07");
		
		int vetorA[] = {0,5,7,9,14,57,123};
		int vetorB[] = {5,2,7,-4,8,10,74,-84};
		
		System.out.println("O vetor A eh: " + verificarVetorCrescente(vetorA));
		System.out.println("O vetor B eh: " + verificarVetorCrescente(vetorB));
	}

}
