package lista_03;

import java.util.Arrays;

public class Questao_20 {

	public static int[] diminuirElemento(int vet[]) {
		return Arrays.copyOf(vet, vet.length-1);
	}
	public static void diminuiVet(int tamanho) {
		int vetor[] = new int[tamanho];
		for (int i = tamanho; i >=1; i--) {
			System.out.println(Arrays.toString(vetor));
			vetor=diminuirElemento(vetor);
		}
	}
	public static void main(String[] args) {
		/*20)Diminuição do vetor: sua função deverá receber um número qualquer que
		represente e criar um vetor com o tamanho informado. Este vetor deverá ter
		sucessivas diminuições do seu tamanho em um unidade até que seu
		tamanho seja igual a 1.*/
		System.out.println("Questao 20");

		diminuiVet(10);
	}

}
