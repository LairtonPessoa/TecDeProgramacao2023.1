package lista_01;

public class Questao_12 {
	public static void main(String[] args) {
		/*12) Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
		B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
		verdadeiras, imprima: "números não válidos". Sejam as afirmações
		anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
		disciplina de Técnicas de Programação”.*/
		System.out.println("Questao 12");
		
		int a = 11;
		int b = 9;
		
		if(a > 10) {
			System.out.println("A > 10");
		}else if(a + b == 20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("numeros nao validos");
		}
		
		System.out.print("\nSejam Bem Vindos a disciplina de Tecnicas de Programacao");
	}
}
