package lista_02;

import java.util.Scanner;

public class Questao_02 {

	public static void main(String[] args) {
		/*2) Escreva um programa que leia uma sequência de números do usuário e
		pare a leitura quando o usuário digitar um número negativo. Em seguida,
		o programa deve imprimir a soma dos números positivos lidos.*/
		System.out.println("Questao 02");
		
		Scanner scanner = new Scanner(System.in);
			int numeros=0;
			int soma=0;
			
			while(numeros>=0){
			soma+=numeros;
				System.out.println("O programa ira parar quando digitar um numero negativo \nDigite um numero: ");
				numeros = scanner.nextInt();
			}
			System.out.println("A soma dos nuemros positivos foram: " + soma);
		scanner.close();

	}

}
