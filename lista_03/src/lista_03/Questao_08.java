package lista_03;

public class Questao_08 {

	public static int kEsimoMaiorValor(int vet[], int k){
		int vetAuxiliar[] = new int[vet.length];
		for (int i = 0; i < vetAuxiliar.length; i++) {//copia o vetor para uma auxiliar
			vetAuxiliar[i] = vet[i];
		}
		for(int i=0;i<vet.length;i++) {//trecho de codigo pego como referencia da questao 6 lista 3
					for(int j=i;j<vet.length;j++) {	
						if(vet[i]<vetAuxiliar[j]) {	//< para ordenar de forma decrescente	
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
		/*8) K-ésimo maior valor: Sua função deverá receber um vetor e um K e retornar
		o K-ésimo maior valor presente no vetor.*/
		System.out.println("Questao  08");
		
		int numerosAleatórios[] = {3, 16, 768, 65, -782, 98, 100, 0, -4};
		
		System.out.println("O 4º maior valor do vetor eh: " + kEsimoMaiorValor(numerosAleatórios, 4));
		
		
	}

}
