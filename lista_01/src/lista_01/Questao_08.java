package lista_01;

public class Questao_08 {
	public static void main(String[] args) {
		/*8) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
		se A mais B é igual a 20, se verdadeiro, imprima: "A + B == 20” se não
		for verdade: imprima "número não válido ".*/
		System.out.println("Questao 08");
		
		int a = 10;
		int b = 10;
		
		if(a > 10) {
			System.out.println("A > 10");
		}
		if( a + b == 20) {
			System.out.println("A + B ==20");
		}else {
			System.out.println("numero nao valido");
		}
	}
}
