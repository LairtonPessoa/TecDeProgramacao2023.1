package lista_01;

public class Questao_01 {

	public static void main(String[] args) {
		/*1) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
		se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
		segunda afirmação não seja verdadeira, imprima: "número não válido".*/
		System.out.println("Questao 01");
		
		int a = 15;
		int b = 4;
		if(a>10) {
			System.out.println("A>10");
		}
		if(a+b == 20) {
			System.out.println("A+B == 20");
		}else {
			System.out.println("numero nao valido");
		}

	}

}
