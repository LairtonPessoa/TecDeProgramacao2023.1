
package trabalho_01;

public class Main {

	public static void main(String[] args) {

		Plano p = new Plano(5, 5);
		
		RoboAndador roboAndador = new RoboAndador(2, "Robo andador", 1, 2, p);
		Peao peao  = new Peao(4, "Peao", 4, 1, p);
		p.exibirPlano();
		System.out.println("\n");
		
		peao.avancarNoPlano();
		roboAndador.retrocederNoPlano(3);
		p.exibirPlano();
		System.out.println("\n");
		
		peao.retrocederNoPlano();
		roboAndador.avancarNoPlano(7);
		p.exibirPlano();
		System.out.println("\n");
				
		peao.retrocederNoPlano();
		roboAndador.retrocederNoPlano(10);
		p.exibirPlano();
		
	}

}
