package trabalho_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plano p = new Plano(5, 5);
		
		RoboAndador roboAndador = new RoboAndador(2, "Robo andador", 4, 2, p);
		Peao peao  = new Peao(4, "Peao", 5, 1, p);
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
