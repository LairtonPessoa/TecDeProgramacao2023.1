package trabalho_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plano p = new Plano(4, 4);
		
		RoboAndador roboAndador = new RoboAndador(2, "Robo andador", 4, 2, p);
		
		System.out.println(roboAndador.verificarOndeTemRobo());
		
		roboAndador.avancarNoPlano(3);
		
		System.out.println("\n");
		
		System.out.println(roboAndador.verificarOndeTemRobo());
		
		roboAndador.retrocederNoPlano(1);
		
		System.out.println("\n");
		
		System.out.println(roboAndador.verificarOndeTemRobo());
		
		
		
		
		
	}

}
