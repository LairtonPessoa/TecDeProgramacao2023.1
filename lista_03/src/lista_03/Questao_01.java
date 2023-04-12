package lista_03;
import java.util.Scanner;
public class Questao_01 {

	public static float somatorio(float valores[]) {
		float soma=0;
		
		for (int i = 2; i < (valores.length - 2); i++) 
			soma += valores[i];
		return soma;
	}
	
	public static void main(String[] args) {
		/*1) Somatório: Sua função deverá receber um vetor como parâmetro e retornar
		a soma de todos elementos do vetor, sendo que as primeiras duas e as
		últimas posições do vetor de entrada não devem ser consideradas;*/
		System.out.println("Questao 01");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce quer digitar?\nObs:Os primeiros dois e ultimos numeros nao serao considerados ");
		int tamanho = scanner.nextInt();
		float numeros[] = new float[tamanho];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o valor: ");
			numeros[i] = scanner.nextFloat();			
		}
		
		
		System.out.println("A soma dos valores considerados eh: " + somatorio(numeros));
		scanner.close();
	}

}
