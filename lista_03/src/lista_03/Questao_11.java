package lista_03;
import java.util.Scanner;
public class Questao_11 {

	public static int potencia(int base, int expoente) {
		int resultado=1;
		for(int i=0;i<expoente;i++) {
			resultado*=base;
		}
		return resultado;
	}
	public static void main(String[] args) {
		/*11)Potenciação: Sua função deverá receber dois números, a base e o
		expoente, e retornar a potência da base elevada ao expoente.*/
		System.out.println("Questao 11");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a base da potencia: ");
		int base = scanner.nextInt();
		
		System.out.print("Digite o expoente da potencia: ");
		int expoente = scanner.nextInt();
		
		System.out.println(base + " elevado a " + expoente + " eh igual a: " + potencia(base, expoente));
		
		scanner.close();
	}

}
