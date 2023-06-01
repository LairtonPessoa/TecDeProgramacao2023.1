package trabalho_01;
import java.util.ArrayList;
import java.util.Scanner;
public class Jogo {

	private Plano planoDoJogo;
	private ArrayList<Entidades> alunosEBugs;
	private ArrayList<Robos> robos;
	
	
	public Jogo() {
		this.instanciarAlunosEBugs();
		robos = new ArrayList<Robos>();
		robos.add(new Andador(3, "Robo Andador", planoDoJogo.tamanhoX, 3, planoDoJogo));
		robos.add(new Peao(4, "Robo Peao", planoDoJogo.tamanhoX/2, 1,planoDoJogo));
		robos.add(new Torre(5, "Robo Torre", planoDoJogo.tamanhoX, planoDoJogo.tamanhoY-2, planoDoJogo));
		robos.add(new Bispo(6, "Robo Bispo", planoDoJogo.tamanhoX, planoDoJogo.tamanhoY-1, planoDoJogo));
		robos.add(new Cavalo(7, "Robo Cavalo", planoDoJogo.tamanhoX, 2, planoDoJogo));
		robos.add(new Rei(8, "Robo Rei/King", planoDoJogo.tamanhoX, 1, planoDoJogo));
		robos.add(new Rainha(9, "Robo Rainha/Queen", planoDoJogo.tamanhoX, planoDoJogo.tamanhoY, planoDoJogo));
	}
	
	public void iniciarJogo() {
		
		boolean jogando = true;
		Scanner scan = new Scanner(System.in);
		
		planoDoJogo.exibirPlano();
		for (Robos robos : robos) {
			System.out.println(robos.exibirPontuacao());
		}
		
		do {
			for (Robos robos : robos) {
				robos.jogar();
			}
			
			planoDoJogo.exibirPlano();
			for (Robos robos : robos) {
				System.out.println(robos.exibirPontuacao());
			}
			
			for (Entidades entidades : alunosEBugs) {
				if(entidades instanceof Aluno)
					((Aluno)entidades).foiAchado();
				if(entidades instanceof Bug)
					((Bug)entidades).foiAchado();
			}
				
			System.out.println("Quer continuar jogando ? ");
			String aux = scan.nextLine();
			aux.toLowerCase();
			
			if(aux.equals("nao"))
				jogando=false;
			
			
		}while(jogando);
		
	
		
		String ganhador="";
		int aux=-1000;
		for (Robos robos : robos) {
			if(robos.pontuacao>aux) {
				aux=robos.pontuacao;
			}
		}
		for (Robos robos : robos) {
			if(aux==robos.pontuacao) {
				ganhador+=robos.nome +", ";
			}
		}
		System.out.println(ganhador + "ganhou com pontuacao: " + aux);
		
	}
	
	public Plano instanciarPlano() {
		Scanner scan = new Scanner(System.in);
		int tamanhoX=0, tamanhoY=0;
		
		do {
			try {
				System.out.println("Digite o tamanho X/Linhas, minimo 7");
				tamanhoX=scan.nextInt();
				System.out.println("Digite o tamanho Y/Colunas, minimo 7");
				tamanhoY=scan.nextInt();
			}catch(Exception e) {
				System.out.println("Tamanho Invalido");
			}
		}while(tamanhoX<7||tamanhoY<7);
		return new Plano(tamanhoX, tamanhoY);
	}
	
	public void instanciarAlunosEBugs() {
		this.planoDoJogo = this.instanciarPlano();
		this.alunosEBugs = new ArrayList<Entidades>();
		
		Scanner scan = new Scanner(System.in);
		int quantidadeDeAlunos = 0, quantidadeDeBugs = 0;
		do {
			try {
				System.out.println("Digite quantos Alunos deseja no Plano: Obs 'A quantidade total de Alunos e Bugs deve ser <= tamanho do plano/2' ");
				quantidadeDeAlunos = scan.nextInt();
				System.out.println("Digite quantos Bugs deseja no Plano: Obs 'A quantidade total de Alunos e Bugs deve ser <= tamanho do plano/2' ");
				quantidadeDeBugs=scan.nextInt();
				
				if((quantidadeDeAlunos+quantidadeDeBugs)>(planoDoJogo.tamanhoX*planoDoJogo.tamanhoY)/2) {
					for (int i = 0; i < (planoDoJogo.tamanhoX*planoDoJogo.tamanhoY)/4 ; i++) {
						alunosEBugs.add(new Aluno(i, planoDoJogo));
						alunosEBugs.add(new Bug(i, planoDoJogo));
					}
				}else {
					for (int i = 0; i < quantidadeDeAlunos; i++) {			
						alunosEBugs.add(new Aluno(i, planoDoJogo));
					}
					for (int i = 0; i < quantidadeDeBugs; i++) {
						alunosEBugs.add(new Bug(i, planoDoJogo));
					}
				}
			
			}catch(Exception e) {
				System.out.println("Quantidade invalida");
			}
		}while(quantidadeDeAlunos==0||quantidadeDeBugs==0);
		
	}
	
	
	
}
