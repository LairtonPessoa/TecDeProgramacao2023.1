package lista_02;
import java.util.Scanner;
public class Questao_08 {

	public static void main(String[] args) {
		/*8) Escreva um programa que utilize uma estrutura para determinar se uma
		expressão matemática contendo parênteses, colchetes e chaves está
		bem formada (ou seja, se cada símbolo de abertura tem um símbolo de
		fechamento correspondente).*/
		System.out.println("Questao 08");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma expressao matematica contendo parenteses, colchetes ou chaves: ");
		String expressao = scanner.nextLine();
		
		int parenteses=0,colchetes=0,chaves=0;
		boolean peloMenosUm=false;
		
		for (int i = 0; i < expressao.length(); i++) {
			char verificar = expressao.charAt(i);
			
			if(verificar=='(') {
				peloMenosUm=true;
				parenteses++;
			}
			if(verificar==')') {
				peloMenosUm=true;
				parenteses--;
			}
			if(verificar=='[') {
				peloMenosUm=true;
				colchetes++;
			}
			if(verificar==']') {
				peloMenosUm=true;
				colchetes--;
			}
			if(verificar=='{') {
				peloMenosUm=true;
				chaves++;
			}
			if(verificar=='}') {
				peloMenosUm=true;
				chaves--;
			}
		}
		
		if(peloMenosUm==false) {
			System.out.println("A expressao nao contem nenhum dos seguintes simbolos: () ou [] ou {}");
		}else if(parenteses==0 && colchetes==0 && chaves==0) {
			System.out.println("A expressao eh bem formada");
		}else {
			System.out.println("A expressao eh mal formada");
		}
		scanner.close();
	}

}
