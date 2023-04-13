package lista_03;

public class Questao_10 {
	
	public static boolean verificarIgualdade(int vetor1[], int vetor2[]) {
		if(vetor1.length==vetor2.length) {
			for(int i=0;i<vetor1.length;i++) {
				if(vetor1[i]!=vetor2[i]) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		/*10) Verificação de igualdade: Sua função deverá receber dois vetores e verificar
		se eles são iguais, ou seja, se possuem os mesmos elementos na mesma
		ordem.*/
		System.out.println("Questao 10");
		
		int vetA[] = {2,4,5,6,8,10,36};
		int vetB[] = {2,4,5,6,8,10,36};
		int vetC[] = {2,4,8,6,8,10,-4};
		int vetD[] = {2,4,5,6,8};
		
		System.out.println("O vetor A e B sao iguais: "+verificarIgualdade(vetB, vetA));
		System.out.println("O vetor A e C sao iguais: "+verificarIgualdade(vetC, vetA));
		System.out.println("O vetor A e D sao iguais: "+verificarIgualdade(vetD, vetA));
		
	}

}
