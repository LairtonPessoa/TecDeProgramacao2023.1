package lista_02;
import java.util.Scanner;
public class Questao_07 {

	public static void main(String[] args) {
		/*7) Crie um programa que use um loop "while" para encontrar o maior
		número primo que é menor do que um número fornecido pelo usuário.*/
		System.out.println("Questao 07");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero e veja o numero primo antecessor a ele: ");
		int numeroDoUsuario = scanner.nextInt();
		int primoAntecessor=(numeroDoUsuario-1), divisor;
		boolean primo=false;
		
		if(numeroDoUsuario<=2) {
			System.out.println("Nao ha numero primo antecessor ao numero digitado\npois o menor numero primo eh 2");
		}else{
			while(primo==false){
				int resto=0;
				for(divisor=1;divisor<=primoAntecessor;divisor++) {
					if(primoAntecessor%divisor==0) {
						resto++;				
					}
					if(resto!=2) {
						primo=false;
					}else {
						primo=true;				
					}
				}
			
				if(primo) {
					System.out.println("O primo antecessor eh: " + primoAntecessor);
				}else{
					primoAntecessor--;
				}
			}
		}scanner.close();
	}
	
}
