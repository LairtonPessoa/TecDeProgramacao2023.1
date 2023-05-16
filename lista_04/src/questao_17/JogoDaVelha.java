package questao_17;

import java.util.InputMismatchException;
import java.util.Scanner;
public class JogoDaVelha {

	protected Plano plano;
	protected Jogadores players;
	
	public JogoDaVelha() {
		plano = new Plano();
		int opcao=0;
			
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Digite o nome do jogador 1: ");
		players=new Jogadores(scanner.nextLine(),null, plano);
		System.out.print("Digite o nome do jogador 2: ");
		players.nomeJogador2=scanner.nextLine();
		
		do {
			try {
				System.out.print("Se o primeiro jogador quiser ser X digite 1 se quiser ser O digite 2: ");
				opcao = scanner.nextInt();
					
			}catch(InputMismatchException e) {
				System.out.println("Erro");
				scanner.nextLine();
			}
				
		}while(opcao!=1&&opcao!=2);
			
		if(opcao==1) {
			plano.setSimbolo1("X");
			plano.setSimbolo2("O");
		}else {
			plano.setSimbolo1("O");
			plano.setSimbolo2("X");
		}
			
		
	}
	
	public String verificarGanhador() {
		if(plano.grade[0][0]!=null||plano.grade[1][1]!=null||plano.grade[0][2]!=null) {
			if((plano.grade[0][0]==plano.grade[0][1]&&plano.grade[0][1]==plano.grade[0][2])&&plano.grade[0][0]!=null&&plano.grade[0][1]!=null&&plano.grade[0][2]!=null){//verificar ganhador nas linhas
				if(plano.grade[0][0]==plano.getSimbolo1())
					return players.nomeJogador1 + " foi o ganhador!";
				else
					return players.nomeJogador2 + " foi o ganhador!";
			}
			if((plano.grade[1][0]==plano.grade[1][1]&&plano.grade[1][1]==plano.grade[1][2])&&plano.grade[1][0]!=null&&plano.grade[1][1]!=null&&plano.grade[1][2]!=null) {
				if(plano.grade[1][0]==plano.getSimbolo1())
					return players.nomeJogador1 + " foi o ganhador!";
				else
					return players.nomeJogador2 + " foi o ganhador!";
			}
			if((plano.grade[2][0]==plano.grade[2][1]&&plano.grade[2][1]==plano.grade[2][2])&&plano.grade[2][0]!=null&plano.grade[2][1]!=null&&plano.grade[2][2]!=null) {
				if(plano.grade[2][0]==plano.getSimbolo1())
					return players.nomeJogador1 + " foi o ganhador!";
				else
					return players.nomeJogador2 + " foi o ganhador!";
			}
			
			
			if((plano.grade[0][0]==plano.grade[1][0]&&plano.grade[1][0]==plano.grade[2][0])&&plano.grade[0][0]!=null&&plano.grade[1][0]!=null&&plano.grade[2][0]!=null){//verificar ganhador nas colunas
				if(plano.grade[0][0]==plano.getSimbolo1())
					return players.nomeJogador1 + " foi o ganhador!";
				else
					return players.nomeJogador2 + " foi o ganhador!";
			}
			if((plano.grade[0][1]==plano.grade[1][1]&&plano.grade[1][1]==plano.grade[2][1])&&plano.grade[0][1]!=null&&plano.grade[1][1]!=null&&plano.grade[2][1]!=null){
				if(plano.grade[0][1]==plano.getSimbolo1())
					return players.nomeJogador1 + " foi o ganhador!";
				else
					return players.nomeJogador2 + " foi o ganhador!";
			}
			if((plano.grade[0][2]==plano.grade[1][2]&&plano.grade[1][2]==plano.grade[2][2])&&plano.grade[0][2]!=null&&plano.grade[1][2]!=null&&plano.grade[2][2]!=null){
				if(plano.grade[0][2]==plano.getSimbolo1())
					return players.nomeJogador1 + " foi o ganhador!";
				else
					return players.nomeJogador2 + " foi o ganhador!";
			}
				
			if((plano.grade[0][0]==plano.grade[1][1]&&plano.grade[1][1]==plano.grade[2][2])&&plano.grade[0][0]!=null||(plano.grade[0][2]==plano.grade[1][1]&&plano.grade[1][1]==plano.grade[2][0])&&plano.grade[0][2]!=null) {//verificar ganhador na diagonal
				if(plano.grade[1][1]==plano.getSimbolo1())
					return players.nomeJogador1 + " foi o ganhador";
				else
					return players.nomeJogador2 + " foi o ganhador";
			}
			
		}else 
			return null;
		return null;
	}
	
	public void iniciarJogo() {
		Scanner scanner = new Scanner(System.in);
		int opcaoX=0, opcaoY=0,jogadas=0;
		boolean controle = false;
		
		
		do {
			System.out.println(plano.exibirPlano());
			
			do {
				try {
				
				System.out.println("Jogador 1 quer jogar em qual posicao de x ? \tObs:Digitar somente o numero e uma opcao valida");
				opcaoX=scanner.nextInt();
				
				System.out.println("Jogador 1 quer jogar em qual posicao de y ? \tObs:Digitar somente o numero e uma opcao valida");
				opcaoY=scanner.nextInt();
				
				controle=players.jogar(opcaoX, opcaoY, plano.getSimbolo1());
				
				}catch(Exception e) {
					System.out.println("POSICAO INVALIDA!!!");
					scanner.nextLine();
				}
			}while(!controle);
			jogadas++;
			
			controle=false;
			
			System.out.println(plano.exibirPlano());
			if(this.verificarGanhador()!=null) {
				System.out.println(this.verificarGanhador());
			}else if(this.verificarGanhador()==null&&jogadas<9){
				do {
					try {
						System.out.println("Jogador 2 quer jogar em qual posicao de x ? \tObs:Digitar somente o numero e uma opcao valida");
						opcaoX=scanner.nextInt();
						System.out.println("Jogador 2 quer jogar em qual posicao de y ? \tObs:Digitar somente o numero e uma opcao valida");
						opcaoY=scanner.nextInt();
							
						controle=players.jogar(opcaoX, opcaoY, plano.getSimbolo2());
						System.out.println(plano.exibirPlano());
						
					}catch(Exception e) {
						System.out.println("POSICAO INVALIDA!!!");
						scanner.nextLine();
					}
				}while(!controle);
				jogadas++;
				
				if(this.verificarGanhador()!=null) 
					System.out.println(this.verificarGanhador());
			}
			
		}while(this.verificarGanhador()==null&&jogadas<9);
		
		if(this.verificarGanhador()==null&&jogadas==9)	
			System.out.println("Deu Velha!");
	
	}
	
	
}
