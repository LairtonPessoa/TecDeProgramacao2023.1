package lista_01;

public class Questao_04 {
	public static void main(String[] args) {
		/*4) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
		imprima: "número válido". Caso as afirmações não sejam verdadeiras,
		Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
		diferentes de 10; A é menor que 10) caso não seja verdade imprima:
		"número não válido".*/
		System.out.println("Questao 04");

		int a = 15;
		int b = 5;
		
		if(a > 10 || a + b == 20) {
			System.out.println("numero valido");
		}else if(a == b) {
			System.out.println("A é igual B; A e B sao diferentes de 10; A eh menor que 10");
		}else {
			System.out.println("numero nao valido");
		}
	}
}
