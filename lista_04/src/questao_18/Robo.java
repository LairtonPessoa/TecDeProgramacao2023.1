package questao_18;

import java.util.ArrayList;


public class Robo extends Entidade{

	private String ultimaDirecaoAndada;
	protected ArrayList<Celula> celulasPercorridasPeloRobo;
	
	public Robo(int id, Plano plano) {
		super(id, plano);
		posicaoX=plano.tamanhoX/2;
		posicaoY=plano.tamanhoY/2;
		celulasPercorridasPeloRobo = new ArrayList<Celula>();
		ultimaDirecaoAndada="Nenhuma";
		
		this.atribuirRoboACelula();
	}
	
	public void andarComValidacao(String movimentacao) {
		celulasPercorridasPeloRobo.add(getCelulaAtualDoRobo());
		movimentacao=movimentacao.toLowerCase();
		
		if(validarMovimentacao(movimentacao)) {
			if(movimentacao.equals("norte")) {
				posicaoX-=1;
			}
			if(movimentacao.equals("sul")) {
				posicaoX+=1;
			}
			if (movimentacao.equals("leste")) {
				posicaoY+=1;
			}
			if (movimentacao.equals("oeste")) {
				posicaoY-=1;
			}
			if(movimentacao.equals("nordeste")) {
				posicaoX-=1;
				posicaoY+=1;
			}
			if(movimentacao.equals("noroeste")) {
				posicaoX-=1;
				posicaoY-=1;
			}
			if(movimentacao.equals("sudeste")) {
				posicaoX+=1;
				posicaoY+=1;
			}
			if(movimentacao.equals("sudoeste")) {
				posicaoX+=1;
				posicaoY-=1;
			}
			this.atribuirRoboACelula();	
		}
	}
	
	public void andarSemValidacao(String movimentacao) {
		celulasPercorridasPeloRobo.add(getCelulaAtualDoRobo());
		movimentacao=movimentacao.toLowerCase();
		
			if(movimentacao.equals("norte")) {
				posicaoX-=1;
			}
			if(movimentacao.equals("sul")) {
				posicaoX+=1;
			}
			if (movimentacao.equals("leste")) {
				posicaoY+=1;
			}
			if (movimentacao.equals("oeste")) {
				posicaoY-=1;
			}
			if(movimentacao.equals("nordeste")) {
				posicaoX-=1;
				posicaoY+=1;
			}
			if(movimentacao.equals("noroeste")) {
				posicaoX-=1;
				posicaoY-=1;
			}
			if(movimentacao.equals("sudeste")) {
				posicaoX+=1;
				posicaoY+=1;
			}
			if(movimentacao.equals("sudoeste")) {
				posicaoX+=1;
				posicaoY-=1;
			}
			this.atribuirRoboACelula();
			
}
	public void caminhadaA() {
		this.posicaoX=0;
		this.posicaoY=0;
		plano.moeda=null;

		this.atribuirRoboACelula();
		System.out.println(plano.exibirPlano());
		
		while(posicaoX < plano.tamanhoX) {
			
			while(posicaoX < plano.tamanhoX && posicaoY < plano.tamanhoY) {
				andarSemValidacao("leste");
				
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
			
				}
				
				System.out.println(plano.exibirPlano());
				
			}
			
			
			this.posicaoX++;
			
			while(posicaoX < plano.tamanhoX && posicaoY >=0) {
				andarSemValidacao("oeste");
				
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
			
				}
				
				System.out.println(plano.exibirPlano());
				
			}
			
			this.posicaoX++;
		}
	}
	
	
	
	public void encontrarMoeda() {
		System.out.println(plano.exibirPlano());
		while(!encontrouMoeda()) {
			if(plano.moeda.getPosicaoX()<this.posicaoX&&plano.moeda.getPosicaoY()==this.posicaoY) 
				this.andarSemValidacao("Norte");
			if(plano.moeda.getPosicaoX()>this.posicaoX&&plano.moeda.getPosicaoY()==this.posicaoY) 
				this.andarSemValidacao("Sul");
			if(plano.moeda.getPosicaoX()==this.posicaoX&&plano.moeda.getPosicaoY()>this.posicaoY) 
				this.andarSemValidacao("Leste");
			if(plano.moeda.getPosicaoX()==this.posicaoX&&plano.moeda.getPosicaoY()<this.posicaoY) 
				this.andarSemValidacao("Oeste");
			if(plano.moeda.getPosicaoX()<this.posicaoX&&plano.moeda.getPosicaoY()<this.posicaoY) 
				this.andarSemValidacao("Noroeste");
			if(plano.moeda.getPosicaoX()<this.posicaoX&&plano.moeda.getPosicaoY()>this.posicaoY) 
				this.andarSemValidacao("Nordeste");
			if(plano.moeda.getPosicaoX()>this.posicaoX&&plano.moeda.getPosicaoY()>this.posicaoY) 
				this.andarSemValidacao("Sudeste");
			if(plano.moeda.getPosicaoX()>this.posicaoX&&plano.moeda.getPosicaoY()<this.posicaoY) 
				this.andarSemValidacao("Sudoeste");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
		
			}
			System.out.println("\n\n"+plano.exibirPlano());
		
		}
}
	
	public boolean encontrouMoeda() {
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.matriz[i][j].temRobo()&&plano.matriz[i][j].temMoeda())
					return true;
			}	
		}
		return false;
	}
	
	public Celula getCelulaAtualDoRobo(){
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.matriz[i][j].posicaoXDaCelula==posicaoX&&plano.matriz[i][j].posicaoYDaCelula==posicaoY)
					return plano.matriz[i][j];
			}
		}
		return null;
	}
	
	public void atribuirRoboACelula() {
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.matriz[i][j].posicaoXDaCelula==posicaoX&&plano.matriz[i][j].posicaoYDaCelula==posicaoY) {
					plano.matriz[i][j].robo = this;
					plano.matriz[i][j].stringDaCelula = "[R]";
					
				}if(plano.matriz[i][j].posicaoXDaCelula!=posicaoX||plano.matriz[i][j].posicaoYDaCelula!=posicaoY){
					plano.matriz[i][j].robo=null;
					
				}if(plano.matriz[i][j].robo==null&&celulasPercorridasPeloRobo.contains(plano.matriz[i][j])) {
					plano.matriz[i][j].stringDaCelula = "[@]";
					
				}if(plano.moeda==null&&plano.matriz[i][j].robo==null&&!celulasPercorridasPeloRobo.contains(plano.matriz[i][j])) {
					plano.matriz[i][j].stringDaCelula="[ ]";
				}
			}
		}
	}
	
	public String relatorioDeCelulasPercorridas() {
		String relatorio = "O robo caminhou pelas celulas:\n";
		
		for (Celula celula : celulasPercorridasPeloRobo) {
			relatorio += "x: " + (celula.posicaoXDaCelula+1) + " y: " + (celula.posicaoYDaCelula+1) + "\n"; 
		}
		relatorio+="e parou na celula:\nx: " + (getCelulaAtualDoRobo().posicaoXDaCelula+1) + " y: " + (getCelulaAtualDoRobo().posicaoYDaCelula+1);
		return relatorio;
	}

	public String relatorioDeCelulasNaoPercorridas() {
		String relatorio = "O robo nao caminhou sobre as celulas:\n";
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(!plano.matriz[i][j].temRobo()&&plano.matriz[i][j].stringDaCelula!="[@]") {
					relatorio+="x: " + (plano.matriz[i][j].posicaoXDaCelula+1) + " y: " + (plano.matriz[i][j].posicaoYDaCelula+1) + "\n"; 
				}
			}
		}
		return relatorio;
	}
	
	public boolean validarMovimentacao(String opcao) {
		if(ultimaDirecaoAndada.equals(opcao)) {
			ultimaDirecaoAndada=opcao;
			return false;
		}
		ultimaDirecaoAndada=opcao;
		return true;
	}
	
}
