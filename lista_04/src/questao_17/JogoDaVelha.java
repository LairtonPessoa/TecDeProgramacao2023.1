package questao_17;

import java.util.Scanner;
public class JogoDaVelha {

	protected Plano plano;
	
	public JogoDaVelha() {
		plano = new Plano();
		
	}
	
	public void iniciarJogo() {
		Scanner scanner = new Scanner(System.in);
		int opcaoX, opcaoY;
		boolean controle;
		int jogadas=0;
		
		
		do {
			plano.exibirPlano();
			
			do {
			System.out.println("Jogador 1 quer jogar em qual posicao de x ? \tObs:Digitar somente o numero e uma opcao valida");
			opcaoX=scanner.nextInt();
			System.out.println("Jogador 1 quer jogar em qual posicao de y ? \tObs:Digitar somente o numero e uma opcao valida");
			opcaoY=scanner.nextInt();
			
			controle=this.plano.jogar(opcaoX, opcaoY, this.plano.getSimbolo1());
			
			}while((opcaoX<0||opcaoX>2)||(opcaoY<0||opcaoY>2)||controle==false);
			jogadas++;
			
			
			plano.exibirPlano();
			if(plano.verificarGanhador()!=null) {
				System.out.println(plano.verificarGanhador());
			}else if(plano.verificarGanhador()==null||jogadas<=9){
				do {
					System.out.println("Jogador 2 quer jogar em qual posicao de x ? \tObs:Digitar somente o numero e uma opcao valida");
					opcaoX=scanner.nextInt();
					System.out.println("Jogador 2 quer jogar em qual posicao de y ? \tObs:Digitar somente o numero e uma opcao valida");
					opcaoY=scanner.nextInt();
					
					controle=this.plano.jogar(opcaoX, opcaoY, this.plano.getSimbolo2());
					
				}while((opcaoX<0||opcaoX>2)||(opcaoY<0||opcaoY>2)||controle==false);
				
				jogadas++;
				plano.exibirPlano();
				if(plano.verificarGanhador()!=null) 
					System.out.println(plano.verificarGanhador());
			}
			
		}while(plano.verificarGanhador()==null||jogadas<=9);
		
	}
	
	
}
