package lista_03;

public class Questao_19 {

	public static boolean isNumberPerfect(int numero) {
		int somaDivisores=0;
		for(int i=1;i<numero;i++) {
			if(numero%i==0) {
				somaDivisores+=i;
			}
		}
		if(somaDivisores==numero)
			return true;
		return false;
			
	}
	public static void main(String[] args) {
		/*19)Verificação de número perfeito: Sua função deverá receber um número
		inteiro e verificar se ele é um número perfeito, ou seja, se a soma dos seus
		divisores próprios é igual a ele mesmo. Exemplo: 6 -> True*/
		System.out.println("Questao 19");
		
		System.out.println("6 -> "+isNumberPerfect(6));
		System.out.println("496 -> "+isNumberPerfect(496));
		System.out.println("12 -> "+isNumberPerfect(12));
		System.out.println("72 -> "+isNumberPerfect(72));
		System.out.println("28 -> "+isNumberPerfect(28));
		
		
		

	}

}
