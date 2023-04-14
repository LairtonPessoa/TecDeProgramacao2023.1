package lista_03;

public class Questao_13 {

	public static int[] concatVet(int vet1[], int vet2[]) {
		int vetorConcatenado[] = new int[vet1.length+vet2.length];
		int i;
		for(i=0;i<vet1.length;i++) {
			vetorConcatenado[i]=vet1[i];
		}
		for(int j=i, k=0;j<vet2.length+vet1.length;j++,k++) {
			vetorConcatenado[j]=vet2[k];
		}
		return vetorConcatenado;
	}
	public static void main(String[] args) {
		/*13) Busca por ocorrências: Sua função deverá receber dois vetores e deverá
		retornar um novo vetor com todos os elementos que aparecem em ambos os
		vetores.*/
		System.out.println("Questao 13");
		
		int vetorA[] = {1,3,4,5,19,0};
		int vetorB[] = {78,-2,765,7};
		int vetorC[] = {0,0,0,0};
	
		
		int vetorAC[] = concatVet(vetorA, vetorC);
		int vetorBC[] = concatVet(vetorB, vetorC);
		int vetorABC[]= concatVet(vetorA, vetorBC);
		
		System.out.print("O vetor resultante de A e C eh: { ");
		for (int i = 0; i < vetorAC.length; i++) {
			System.out.print(vetorAC[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("O vetor resultante de B e C eh: { ");
		for (int i = 0; i < vetorBC.length; i++) {
			System.out.print(vetorBC[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("O vetor resultante de A, B e C eh: { ");
		for (int i = 0; i < vetorABC.length; i++) {
			System.out.print(vetorABC[i] + " ");
		}
		System.out.println("}");
	}

}
