package lista_03;

public class Questao_09 {
	public static int kEsimoMenorValor(int vet[], int k){
		int vetAuxiliar[] = new int[vet.length];
		for (int i = 0; i < vetAuxiliar.length; i++) {//copia o vetor para uma auxiliar
			vetAuxiliar[i] = vet[i];
		}
		for(int i=0;i<vet.length;i++) {//trecho de codigo pego como referencia da questao 6 lista 3
					for(int j=i;j<vet.length;j++) {	
						if(vet[i]>vetAuxiliar[j]) {	//< para ordenar de forma crescente	
							vet[i]=vetAuxiliar[j];			
							vetAuxiliar[j]=vetAuxiliar[i];
							vet[j]=vetAuxiliar[i];			
							vetAuxiliar[i]=vet[i];			
						}
					}
				} 
		return vet[k-1];
	}

	public static void main(String[] args) {
		/*9) K-ésimo menor valor: Sua função deverá receber um vetor e um K e
		retornar o K-ésimo menor valor presente no vetor.*/
		System.out.println("Questao 09");
		
		int numerosAleatórios[] = {3, 16, 768, 65, -782, 98, 100, 0, -4};
		//codigo semi-igual ao da questao 08 lista 03
		System.out.println("O 9º menor valor do vetor eh: " + kEsimoMenorValor(numerosAleatórios, 9));

	}

}
