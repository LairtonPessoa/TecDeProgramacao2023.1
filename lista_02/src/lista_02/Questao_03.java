package lista_02;

import java.util.Scanner;

public class Questao_03 {

	public static void main(String[] args) {
		/*3) Escreva um programa que peça ao usuário para adivinhar um número
		entre 1 e 100. Se o usuário adivinhar incorretamente, o programa deve
		dizer se o número a ser adivinhado é maior ou menor do que o número
		digitado pelo usuário. O programa deve continuar a pedir ao usuário que
		adivinhe até que ele adivinhe corretamente.*/
		System.out.println("Questao 03");
		
		int numSorteio = 46, adivinha = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(adivinha!=numSorteio) {
			System.out.println("Adivinhe um numero entre 0 e 100: ");
			adivinha = scanner.nextInt();
			
			if(adivinha>numSorteio) {
				System.out.println("O numero a ser adivinhado eh menor");
			}else if(adivinha<numSorteio) {
				System.out.println("O numero a ser adivinhado eh maior");
			}else {
				System.out.println("Parabens voce acertou o numero!");
			}
		}
		scanner.close();
	}

}
