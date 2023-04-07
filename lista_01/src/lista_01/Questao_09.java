package lista_01;

public class Questao_09 {
	public static void main(String[] args) {
		/*9) Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
		verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
		verdadeiras imprima: "número não válido".*/
		System.out.println("Questao 09");
		
		int a = 12;
		int b = 8;

		if (a > 10 && (a + b) == 20) {
		  System.out.println("A + B == 20");
		} else {
		  System.out.println("numero nao valido");
		}


	}
}
