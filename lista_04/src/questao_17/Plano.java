package questao_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Plano {

	private String plano[][];
	private String simbolo1;
	private String simbolo2;
	private Jogadores jogadores;
	
	public Plano() {
		plano = new String[3][3];
		int opcao=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do jogador 1: ");
		jogadores=new Jogadores(scanner.nextLine(),null);
		System.out.print("Digite o nome do jogador 2: ");
		jogadores.nomeJogador2=scanner.nextLine();
		
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
			this.simbolo1="X";
			this.simbolo2="O";
		}else {
			this.simbolo1="O";
			this.simbolo2="X";
		}
		
	}
	
	public String verificarGanhador() {
		if(plano[0][0]!=null&&plano[1][1]!=null&&plano[0][2]!=null) {
			if((plano[0][0]==plano[0][1]&&plano[0][1]==plano[0][2])&&plano[0][0]!=null){//verificar ganhador nas linhas
				if(plano[0][0]==simbolo1)
					return this.jogadores.nomeJogador1 + " foi o ganhador!";
				else
					return this.jogadores.nomeJogador2 + " foi o ganhador!";
			}
			if((plano[1][0]==plano[1][1]&&plano[1][1]==plano[1][2])&&plano[1][0]!=null) {
				if(plano[1][0]==simbolo1)
					return this.jogadores.nomeJogador1 + " foi o ganhador!";
				else
					return this.jogadores.nomeJogador2 + " foi o ganhador!";
			}
			if((plano[2][0]==plano[2][1]&&plano[2][1]==plano[2][2])&&plano[2][0]!=null) {
				if(plano[2][0]==simbolo1)
					return this.jogadores.nomeJogador1 + " foi o ganhador!";
				else
					return this.jogadores.nomeJogador2 + " foi o ganhador!";
			}
			
			
			if((plano[0][0]==plano[1][0]&&plano[1][0]==plano[2][0])&&plano[0][0]!=null){//verificar ganhador nas colunas
				if(plano[0][0]==simbolo1)
					return this.jogadores.nomeJogador1 + " foi o ganhador!";
				else
					return this.jogadores.nomeJogador2 + " foi o ganhador!";
			}
			if((plano[0][1]==plano[1][1]&&plano[1][1]==plano[2][1])&&plano[0][1]!=null){
				if(plano[0][1]==simbolo1)
					return this.jogadores.nomeJogador1 + " foi o ganhador!";
				else
					return this.jogadores.nomeJogador2 + " foi o ganhador!";
			}
			if((plano[0][2]==plano[1][2]&&plano[1][2]==plano[2][2])&&plano[0][2]!=null){
				if(plano[0][2]==simbolo1)
					return this.jogadores.nomeJogador1 + " foi o ganhador!";
				else
					return this.jogadores.nomeJogador2 + " foi o ganhador!";
			}
				
			if((plano[0][0]==plano[1][1]&&plano[1][1]==plano[2][2])||(plano[0][2]==plano[1][1]&&plano[1][1]==plano[2][0])) {//verificar ganhador na diagonal
				if(plano[1][1]==simbolo1)
					return this.jogadores.nomeJogador1 + " foi o ganhador";
				else
					return this.jogadores.nomeJogador2 + " foi o ganhador";
			}
			
		}else 
			return null;
		return null;
	}
	
	public boolean jogar(int posicaoX, int posicaoY, String simbolo) {
		if(plano[posicaoX][posicaoY]==null) {
			plano[posicaoX][posicaoY]=simbolo;
			return true;
		}else {
			System.out.println("Essa posicao ja foi ocupada");
			return false;
		}
			
	}
	
	public void exibirPlano() {
		System.out.println("   y0\t   y1\t   y2");
		
		System.out.println("\t|\t|");
		if(plano[0][0]!=null)
			System.out.print("   "+plano[0][0]);
		else
			System.out.print("    ");
		if(plano[0][1]!=null)
			System.out.print("\t|   " + plano[0][1]+ "  ");
		else
			System.out.print("\t|      ");
		if(plano[0][2]!=null)
			System.out.println("\t|   " + plano[0][2] + "     x0");
		else
			System.out.println("\t|         x0");
		System.out.println("\t|\t|");
		
		System.out.println("------------------------");
		System.out.println("\t|\t|");
		if(plano[1][0]!=null)
			System.out.print("   "+plano[1][0]);
		else
			System.out.print("    ");
		if(plano[1][1]!=null)
			System.out.print("\t|   " + plano[1][1]+ "  ");
		else
			System.out.print("\t|      ");
		if(plano[1][2]!=null)
			System.out.println("\t|   " + plano[1][2] + "     x1");
		else
			System.out.println("\t|         x1");
		System.out.println("\t|\t|");
		
		System.out.println("------------------------");
		System.out.println("\t|\t|");
		if(plano[2][0]!=null)
			System.out.print("   "+plano[2][0]);
		else
			System.out.print("    ");
		if(plano[2][1]!=null)
			System.out.print("\t|   " + plano[2][1]+ "  ");
		else
			System.out.print("\t|      ");
		if(plano[2][2]!=null)
			System.out.println("\t|   " + plano[2][2] + "     x2");
		else
			System.out.println("\t|         x2");
		System.out.println("\t|\t|");
		
	}

	public String getSimbolo1() {
		return simbolo1;
	}

	public String getSimbolo2() {
		return simbolo2;
	}

	public Jogadores getJogadores() {
		return jogadores;
	}
	
}
