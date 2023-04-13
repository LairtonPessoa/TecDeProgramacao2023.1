package lista_03;

public class Questao_06 {

	public static int[] ordCrescente(int vet[]) {
		int vetAuxiliar[] = new int[vet.length];
		for (int i = 0; i < vetAuxiliar.length; i++) {//copia o vetor para uma auxiliar
			vetAuxiliar[i] = vet[i];
		}
		
		for(int i=0;i<vet.length;i++) {//for para fixar desde a primeira posiçao até o final do vetor passado.
			
			for(int j=i;j<vet.length;j++) {	//j=i pois apos analizar uma posição no vetor dado até o final, não olhamos novamente  
											//para a mesma posição pois ja esta ordenada
				
				if(vet[i]>vetAuxiliar[j]) {	//verifica se a posição fixada é maior que as demais posições
					
					vet[i]=vetAuxiliar[j];			//troca a posição fixada com a menor do vetor auxiliar
					vetAuxiliar[j]=vetAuxiliar[i];	//salva o numero que foi trocado/que estava fixado/que foi perdido no vetor principal
					vet[j]=vetAuxiliar[i];			//troca o numero que esta na posição que foi trocado para receber novamente o valor que tinha sido perdido, mas salvo no vetor auxiliar
					vetAuxiliar[i]=vet[i];			//troca o numero que foi salvo para aquele que foi trocado no vetor principal organizando assim ambos os vvetores
					
				}
			
			}
		}
		return vet;
	}
	
	public static void main(String[] args) {
		/*6) Ordenação crescente: Sua função deverá receber um vetor e retornar o
		vetor ordenado em ordem crescente. Exemplo: [5, 2, 9, 1, 7] -> [1, 2, 5, 7, 9]*/
		System.out.println("Questao 06");
		
		int numerosDesorganizados[] = {48, 3, -5, 9, -100, 3, 0, -5, 48, 10, 7};
		int numerosOrganizados[]=ordCrescente(numerosDesorganizados);
		
		System.out.print("Os numeros organizados de forma crescente serao: { ");
		
		for (int i = 0; i < numerosOrganizados.length; i++) {
			System.out.print(numerosOrganizados[i] + " ");
		}
		
		System.out.print("}");
	}

}
