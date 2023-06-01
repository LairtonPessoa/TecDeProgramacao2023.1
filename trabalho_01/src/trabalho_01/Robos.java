package trabalho_01;

import java.util.Scanner;

public abstract class Robos extends Entidades implements AcoesDosRobos{

	public String movimentacao;
	 
	public Robos(int id, String nome, int posicaoX, int posicaoY, Plano plano) {
		super(id, plano);
		this.nome = nome;
		this.posicaoXdaEntidade = posicaoX;
		this.posicaoYdaEntidade = posicaoY;
		pontuacao = 0;
		visibilidade=true;
		
		this.atribuirEntidadeACelula();
	}
	
	public String exibirPontuacao() {
		return this.nome + " (" + this.caractere + ") tem " + pontuacao + " pontos e " + movimentacao;
	}
	
	public boolean computarPontuacao(Celula celula) {
		for (Entidades entidade : celula.listaEntidade) {
			if(entidade.podeComputarPontuacao()) {
				this.pontuacao+=entidade.pontuacao;	
				if(this.visibilidade)
					this.visibilidade=false;
				
				if(!entidade.visibilidade)
					entidade.visibilidade=true;
				return true;
			}
		}
		return false;
	}
	
	public void jogar() {
		Scanner scan = new Scanner(System.in);
		String movimentacao;
		boolean validacao=false;
		
		do {
			try {
				System.out.println("O " + this.nome + " ira andar ou retroceder ? ");
				movimentacao = scan.nextLine();
				movimentacao.toLowerCase();
				
				if(movimentacao.equals("andar")) {
					System.out.println("Quantas casas ? ");
					validacao=this.avancar(scan.nextInt());
					
				}
				if(movimentacao.equals("retroceder")) {
					System.out.println("Quantas casas ? ");
					validacao=this.retroceder(scan.nextInt());
				}
				
			}catch(Exception e){
				System.out.println("Movimento invalidado!");
				scan.nextLine();
			}
			scan.nextLine();
		}while(!validacao);
	}
}
