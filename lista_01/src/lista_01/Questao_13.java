package lista_01;

public class Questao_13 {
	public static void main(String[] args) {
		/*13) Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
		verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
		Caso as afirmações não sejam verdadeiras, imprima: "números não
		válidos"."*/
		System.out.println("Questao 13");
		
		int a = 11;
		int b = 9;
		
		if(a > 10) {
			System.out.println("A > 10");
		}else {
			System.out.println("numeros nao validos");
		}
		if(a + b== 20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("numeros nao validos");
		}
	}
}
