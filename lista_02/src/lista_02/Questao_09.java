package lista_02;

public class Questao_09 {

	public static int fatorial(int numero) {
		if(numero==1)
			return 1;
		else
			return numero*fatorial(numero-1);
	}
	
	public static void main(String[] args) {
		
		/*9) Faça um programa para gerar todas as permutações de um conjunto de
		caracteres (por exemplo, "ABC" pode gerar "ABC", "ACB", "BAC",
		"BCA", "CAB" e "CBA").*/
		System.out.println("Questao 09");
		String caracteres = new String();
		caracteres="ABCD";
		int totalPermutacoes = fatorial(caracteres.length());
		int permutacaoDeCadaLetra = totalPermutacoes/caracteres.length();	
		System.out.println(totalPermutacoes +" "+permutacaoDeCadaLetra);
		
	}
}


