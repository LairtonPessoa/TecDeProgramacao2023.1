package lista_03;

public class Questao_16 {
	public static void isPrimo(int numero) {
		int teste=0;
		for(int i=1;i<=numero;i++) {
			if(numero%i==0) {
				teste++;
			}
		}
		if(teste==2) {
			System.out.println("Numero " + numero + " -> true" );
		}else {
			System.out.println("Numero " + numero + " -> false" );
		}
	}
	public static void main(String[] args) {
		/*16)Verificação de número primo: Sua função deverá receber um número
		inteiro e verificar se ele é um número primo. Exemplo: 7 -> True.*/
		System.out.println("Questao 16");
		//Questao extremamente similar a questao 12 lista 3
		
		isPrimo(10);
		isPrimo(7);
		isPrimo(678);
		isPrimo(997);
		isPrimo(2);
		isPrimo(1);
	}

}
