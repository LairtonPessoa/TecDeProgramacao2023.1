
package trabalho_01;

public class Main {

	public static void main(String[] args) {

		Plano p = new Plano(5, 5);
		
		RoboAndador roboAndador = new RoboAndador(2, "Robo andador", 4, 2, p);
		Peao peao  = new Peao(4, "Peao", 5, 1, p);
		p.exibirPlano();
		System.out.println("\n");
		
		peao.avancarNoPlano();
		roboAndador.retrocederNoPlano(0);
		p.exibirPlano();
		System.out.println("\n");
		
		peao.avancarNoPlano();
		roboAndador.avancarNoPlano(3);
		p.exibirPlano();
		
		
	}

}
