package lista_03;

public class Questao_12 {

	public static void isPrimo(int numero) {
		int teste=0;
		for(int i=1;i<=numero;i++) {
			if(numero%i==0) {
				teste++;
			}
		}
		if(teste==2) {
			System.out.println("O numero " + numero + " eh primo");
		}else {
			System.out.println("O numero " + numero + " nao eh primo");	
		}
	}
	public static void main(String[] args) {
		/*12)Primo: Sua função deverá receber um número inteiro e verificar se ele é
		primo, ou seja, se é divisível apenas por 1 e por ele mesmo.*/
		System.out.println("Questao 12");
		
		isPrimo(10);
		isPrimo(7);
		isPrimo(678);
		isPrimo(997);
		isPrimo(2);
		isPrimo(1);
	}

}
