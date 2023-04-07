package lista_02;
import java.util.Scanner;
public class Questao_04 {

	public static void main(String[] args) {
		/*4) Escreva um programa que imprima a tabela de multiplicação de um
		número específico fornecido pelo usuário usando um loop while.*/
		System.out.println("Questao 04");
		
		Scanner scanner = new Scanner(System.in);
		int contador=0;
		
		System.out.print("Digite um numero e veja sua tabela de multiplicacao: ");
		int numero = scanner.nextInt();
		
		while(contador<=10) {
			System.out.println(numero + " * " + contador + " = " +numero*contador);
			contador++;
		}
		scanner.close();
	}

}
