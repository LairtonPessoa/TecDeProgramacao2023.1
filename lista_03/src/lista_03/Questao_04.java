package lista_03;

public class Questao_04 {

	public static int contagemDeElementeos(int vet1[],  int vet2[], int elementoASerContado) {
		int quantidade=0;
		for(int i=0;i<vet1.length;i++) {
			if(vet1[i]==elementoASerContado) {
				quantidade++;
			}
		}
		for(int i=0;i<vet2.length;i++) {
			if(vet2[i]==elementoASerContado) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	public static void main(String[] args) {
		/*4) Contagem de elementos: Sua função deverá receber dois vetores e um
		elemento a ser contado. A função deve retornar a quantidade de vezes que
		esse elemento aparece nos vetores. Exemplo: [1,3, 3, 2, 5],[1, 2, 3, 2, 4],
		2 -> 3*/
		System.out.println("Questao 04");
		
		int vetorA[]= {1,3,3,2,5};
		int vetorB[]= {1,2,3,2,4};
		int numero=2;
		
		System.out.println("O numero " + numero + " se repete " + contagemDeElementeos(vetorA, vetorB, numero) + " vezes");
	}

}
