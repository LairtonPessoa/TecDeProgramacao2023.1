package lista_03;

public class Questao_17 {
	
	public static String inverterString(String palavra) {//trecho de código pego como referencia questão 15 lista 3
		char auxiliar[]=new char[palavra.length()];
		char charString[] = palavra.toCharArray();
		
		for(int i=0,j=palavra.length()-1;i<palavra.length();j--,i++) {
			auxiliar[i]=charString[j];
		}
		palavra = String.valueOf(auxiliar);
		
		return palavra;
	}
	public static void main(String[] args) {
		/*17)Inversão de string: Sua função deverá receber uma string e retornar a
		mesma string invertida. Exemplo: "hello" -> "olleh".*/
		System.out.println("Questao 17");
		
		String palavra = "hello";
		
		System.out.println("\""+palavra+"\" -> "+inverterString(palavra));

	}

}
