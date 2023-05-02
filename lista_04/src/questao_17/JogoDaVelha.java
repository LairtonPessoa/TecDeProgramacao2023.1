package questao_17;

public class JogoDaVelha {

	private String plano[][];
	private String jogador1;
	private String jogador2;
	
	public JogoDaVelha(String jogador1, String jogador2) {
		plano = new String[3][3];
		this.jogador1=jogador1;
		this.jogador2=jogador2;
	}
	
	public void jogar(int posicaoX, int posicaoY, String simbolo) {
		plano[posicaoX][posicaoY]=simbolo;
	}
	
	
	public void exibirPlano() {
		System.out.println("   x0\t   x1\t   x2");
		
		System.out.println("\t|\t|");
		if(plano[0][0]==null)
			System.out.print("   n");
		if(plano[0][1]==null)
			System.out.print("\t|   n  ");
		if(plano[0][2]==null)
			System.out.println("\t|   n     y0");
		System.out.println("\t|\t|");
		
		System.out.println("------------------------");
		System.out.println("\t|\t|");
		if(plano[1][0]==null)
			System.out.print("   n");
		if(plano[1][1]==null)
			System.out.print("\t|   n  ");
		if(plano[1][2]==null)
			System.out.println("\t|   n     y1");
		System.out.println("\t|\t|");
		
		System.out.println("------------------------");
		System.out.println("\t|\t|");
		if(plano[2][0]==null)
			System.out.print("   n");
		if(plano[2][1]==null)
			System.out.print("\t|   n  ");
		if(plano[2][2]==null)
			System.out.println("\t|   n     y2");
		System.out.println("\t|\t|");
		
	}
	
}
