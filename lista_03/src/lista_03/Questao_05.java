package lista_03;

public class Questao_05 {

	public static int[] copiaVetor(int vetor[]) {
		int copia[] = new int[vetor.length];
		
		for(int i=0;i<vetor.length;i++) {
			copia[i]=vetor[i];
		}
		return copia;
	}
	public static void main(String[] args) {
		/*5) Cópia de vetor: Sua função deverá receber um vetor e retornar uma cópia
		exata desse vetor.*/
		System.out.println("Questao 05");
		
		int vet[] = {49,8,-1,0,10,-84};
		int copia[]=copiaVetor(vet);

		System.out.print("O vetor eh: { ");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
			
		}
		
		System.out.print("}\nA copia do vetor eh: { ");
		for (int i = 0; i < copia.length; i++) {
			System.out.print(copia[i] + " ");
			
		}
		System.out.print("}");

	}

}
