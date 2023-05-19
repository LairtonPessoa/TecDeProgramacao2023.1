
package trabalho_01;

public class Main {

	public static void main(String[] args) {

		Plano p = new Plano(9, 9);
		
		RoboAndador roboAndador = new RoboAndador(2, "Robo andador", 9, 5, p);
		Peao peao  = new Peao(4, "Peao", 5, 1, p);
		Aluno aluno = new Aluno(13, p);
		
		peao.avancarNoPlano();
		roboAndador.avancarNoPlano(4);
		peao.avancarNoPlano();
		peao.avancarNoPlano();
		peao.avancarNoPlano();
		peao.avancarNoPlano();
		
		
		
		p.exibirPlano();
		System.out.println();
		
		System.out.println(roboAndador.exibirPontuacao());
		System.out.println(peao.exibirPontuacao());
		
	}

}
