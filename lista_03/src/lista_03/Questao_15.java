package lista_03;

public class Questao_15 {

	public static String inverterString(String palavra) {
		char auxiliar[]=new char[palavra.length()];
		char charstr[] = palavra.toCharArray();
		
		for(int i=0,j=palavra.length()-1;i<palavra.length();j--,i++) {
			auxiliar[i]=charstr[j];
		}
		palavra = String.valueOf(auxiliar);
		
		return palavra;
	}
	public static boolean isPalindromo(String palavra) {
		String palavraInvertida = inverterString(palavra);
		return palavra.equals(palavraInvertida);
	}
	public static void main(String[] args) {
		/*15)Verificação de palíndromo: Sua função deverá receber uma string e
		verificar se ela é um palíndromo, ou seja, se pode ser lida da mesma forma
		de trás para frente. Exemplo: "ana" -> True.*/
		System.out.println("Questao 15");
		
		String palindromo = "ana";
		String nPalindromo = "hello world";
		
		System.out.println("\"" + palindromo + "\" -> "+isPalindromo(palindromo));
		System.out.println("\"" + nPalindromo + "\" -> "+isPalindromo(nPalindromo));
	}

}
