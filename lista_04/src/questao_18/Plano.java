package questao_18;

import java.util.Random;

public class Plano {

	protected Celula matriz[][];
	protected int tamanhoX;
	protected int tamanhoY;
	protected Moeda moeda;
	
	public Plano(int tamanhoX, int tamanhoY) {
		matriz = new Celula[tamanhoX][tamanhoY];
		this.tamanhoX=tamanhoX;
		this.tamanhoY=tamanhoY;
		
		Celula aux;
		for (int i = 0; i < tamanhoX; i++) {
			for (int j = 0; j < tamanhoY; j++) {
				aux = new Celula(i,j);
				matriz[i][j]=aux;
			}
		}
		
		moeda = new Moeda();
		
		Random random = new Random();
		
		int posicaoAleatoriaDeX=this.tamanhoX/2;
		int posicaoAleatoriaDeY=this.tamanhoY/2;
		
		while(posicaoAleatoriaDeX==tamanhoX/2&&posicaoAleatoriaDeY==tamanhoY/2) {
			posicaoAleatoriaDeX = random.nextInt(tamanhoX);
			posicaoAleatoriaDeY = random.nextInt(tamanhoY);
		}
		
		moeda.setPosicaoX(posicaoAleatoriaDeX);
		moeda.setPosicaoY(posicaoAleatoriaDeY);
		
		for (int i = 0; i < tamanhoX; i++) {
			for (int j = 0; j < tamanhoY; j++) {
				if(matriz[i][j].posicaoXDaCelula==moeda.getPosicaoX()&&matriz[i][j].posicaoYDaCelula==moeda.getPosicaoY()) {
					matriz[i][j].moeda = moeda;
					matriz[i][j].stringDaCelula = "[$]"; 
				}
			}
		}
	}
	
	public String exibirPlano() {
		String plano="";
		
		for (int i = 0; i < tamanhoX; i++) {
			for (int j = 0; j < tamanhoY; j++) {
				plano+=matriz[i][j].stringDaCelula;
			}
			plano+="\n";
		}
		return plano;
	}

	
}
