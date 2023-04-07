package lista_02;
import java.util.Scanner;
public class Questao_06 {

	public static void main(String[] args) {
		/*6) Escreva um programa que utilize uma estrutura "if-else" para verificar se
		uma matriz é simétrica (ou seja, a matriz é igual à sua transposta).*/
		System.out.println("Questao 06");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas da matriz: ");
		int linhas = scanner.nextInt();
		System.out.print("Digite a quantidade de colunas da matriz: ");
		int colunas = scanner.nextInt();
		
		int matriz[][]= new int [linhas][colunas];
		boolean simetrica=true;
		
		for(int i=0; i < linhas; i++) {//povoamento da matriz
			for(int j=0;j < colunas;j++) {
				System.out.print("Digite o elemento da linha " + (i+1) + " coluna " + (j+1) + ": ");
				matriz[i][j]=scanner.nextInt();
			}
		}
		
		if(linhas==colunas) {//primeira verificação para saber se a matriz é quadrada
			for (int i = 0; i < linhas; i++){
				for (int j = 0; j < colunas; j++){
					if(matriz[i][j]!=matriz[j][i]){	//segunda verificação é se tiver pelo menos um elemento diferente
						simetrica=false;			//da relação [linhas][colunas] [colunas][linhas] a simetria sera falsa
					}
				}
			}
		}else{
			simetrica=false;
		}
		
		if(simetrica){
			System.out.println("A matriz eh simetrica!");
		}else {
			System.out.println("A matriz nao eh simetrica!");
		}
		scanner.close();
	}
}