package lista_01;

public class Questao_07 {
	public static void main(String[] args) {
		/*7) Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
		verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
		afirmação não seja verdadeira, imprima: "número não válido".*/
		System.out.println("Questao 07");
		
		int a = 10;
		int b = 5;
	
		if(a > 10 || a + b == 20) {
			System.out.println("numeros validos"); 
		}else {
			System.out.println("numero nao valido");
		}

	}
}
