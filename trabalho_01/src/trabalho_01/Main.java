package trabalho_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plano p = new Plano(4, 4);
		
		RoboAndador roboAndador = new RoboAndador(2, "Robo andador", 3, 2, p);
		Peao peao  = new Peao(4, "Peao", 4, 1, p);
		p.exibirPlano();
		System.out.println("\n");
		
		peao.avancarNoPlano();
		roboAndador.avancarNoPlano(2);
		p.exibirPlano();
		System.out.println("\n");
		
		peao.avancarNoPlano();
		roboAndador.retrocederNoPlano(3);
		p.exibirPlano();
		System.out.println("\n");
		
		
	}

}
