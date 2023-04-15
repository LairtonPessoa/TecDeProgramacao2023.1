package lista_03;

public class Questao_14 {

	public static int contagemDeElementos(int vet[],int elemento) {
		int quantidade=0;
		for(int i=0;i<vet.length;i++) {
			if(vet[i]==elemento) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	public static int[] removeElement(int vet[], int elemento) {
		int newVet[] = new int[vet.length-contagemDeElementos(vet, elemento)];
		for(int i=0, j=0;i<newVet.length;) {
			while(i<newVet.length) {
				if(vet[j]!=elemento) {
					newVet[i]=vet[j];
					i++;
				}
				j++;
			}
		}
		return newVet;
}
	public static void main(String[] args) {
		/*14)Remoção de elemento do vetor: Sua função deverá receber um vetor e um
		elemento a ser removido. A função deve remover todas as ocorrências desse
		elemento no vetor. Um novo vetor, apenas com elementos mantindos, deve
		ser retornado: Exemplo: [1, 2, 3, 2, 4], 2 -> [1, 3, 4]*/
		System.out.println("Questao 14");
		
		int vetorAntigo[] = {1,2,3,2,4,-2,2,3,2,4};
		int novoVetor[] = removeElement(vetorAntigo, 2);
		
		System.out.print("O novo vetor eh: { ");
		for (int i = 0; i < novoVetor.length; i++) {
			System.out.print(novoVetor[i]+ " ");
		}
		System.out.print("}");

	}

}
