package lista_02;
import java.util.Scanner;
public class Questao_05 {

	public static void main(String[] args) {
		/*5) Faça um programa que possa exibir uma sequência como a abaixo,
		sendo o limite superior dos pares da esquerda e direita informados pelo
		usuário. Exemplo: com pares da esquerda e direta com o limite superior
		de 2 unidades.*/
		System.out.println("Questao 05");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o limite superior para a sequencia: ");
		int limiteSuperior = scanner.nextInt();
		int parEsquerda=0, parDireita;

		while(parEsquerda<=limiteSuperior) {
			parDireita=0;
			while(parDireita<=limiteSuperior) {
				System.out.println(parEsquerda + " = " + parDireita);
				parDireita++;
			}
			parEsquerda++;
		}scanner.close();
	}
}