package lista_01;

public class Questao_05 {
	public static void main(String[] args) {
		/*5) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
		imprima: "número válido". Caso as afirmações não sejam verdadeiras,
		imprima: "número não válido".*/
		System.out.println("Questao 05");
		
		int a = 20;
		int b = 1;
		if(a > 10 || a + b == 20) {
			System.out.println("numero valido");
		}else {
			System.out.println("numero nao valido");
		}
	}
}
