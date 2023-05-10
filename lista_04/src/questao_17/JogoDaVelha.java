package questao_17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class JogoDaVelha {

	protected Plano plano;
	
	public JogoDaVelha() {
		plano = new Plano();
		
	}
	
	public void iniciarJogo() {
		Scanner scanner = new Scanner(System.in);
		int opcaoX=0, opcaoY=0;
		boolean controle;
		int jogadas=0;
		
		
		do {
			plano.exibirPlano();
			
			try {
				do {
				System.out.println("Jogador 1 quer jogar em qual posicao de x ? \tObs:Digitar somente o numero e uma opcao valida");
				opcaoX=scanner.nextInt();
				
				System.out.println("Jogador 1 quer jogar em qual posicao de y ? \tObs:Digitar somente o numero e uma opcao valida");
				opcaoY=scanner.nextInt();
				
				controle=plano.jogar(opcaoX, opcaoY, this.plano.getSimbolo1());
				}while(!controle);
				
			jogadas++;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("POSICAO INVALIDA!!!\nPunicao: Perdeu a vez");
			}catch(InputMismatchException e) {
				System.out.println("POSICAO INVALIDA!!!\nPunicao: Perdeu a vez");
				scanner.nextLine();
			}
			
			
			plano.exibirPlano();
			if(plano.verificarGanhador()!=null) {
				System.out.println(plano.verificarGanhador());
			}else if(plano.verificarGanhador()==null&&jogadas<9){
				try {
					do {
						System.out.println("Jogador 2 quer jogar em qual posicao de x ? \tObs:Digitar somente o numero e uma opcao valida");
						opcaoX=scanner.nextInt();
						System.out.println("Jogador 2 quer jogar em qual posicao de y ? \tObs:Digitar somente o numero e uma opcao valida");
						opcaoY=scanner.nextInt();
						
						controle=plano.jogar(opcaoX, opcaoY, this.plano.getSimbolo2());
						plano.exibirPlano();
						jogadas++;
					}while(!controle);
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("POSICAO INVALIDA!!!\nPunicao: Perdeu a vez");
				}catch(InputMismatchException e) {
					System.out.println("POSICAO INVALIDA!!!\nPunicao: Perdeu a vez");
					scanner.nextLine();
				}
				
				
				if(plano.verificarGanhador()!=null) 
					System.out.println(plano.verificarGanhador());
			}
			
		}while(plano.verificarGanhador()==null&&jogadas<9);
		System.out.println("Deu Velha!");
	
	}
	
	
}
