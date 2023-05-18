package negocio;

import java.util.Random;

import apresentacao.*;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
//	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;

	public Jogo() {
		tela = new Tela();
//		terminal = new Terminal();
		jogador = new Jogador();
		jogando = true;
		
		Random random = new Random();
		numeroEscolhido=random.nextInt(100);
	}

//	public void inciarJogoTerminal() {
//		jogador.setNome(terminal.entradaNome());
//		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
//	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual é o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
	}

	public void solicitarNumero() {
			try {
				String numero = tela.entradaDados("Informe um número:");
				int numeroInteiro = Integer.parseInt(numero);
				jogador.addNumero(numeroInteiro);
				verificarAcerto(numeroInteiro);
			}catch(Exception e) {
				tela.mesagem("O dado inserido não corresponde a um número, por favor tente novamente");
				solicitarNumero();
			}
	}

	public void jogadas() {
		do {
			jogador.setNumeroTentativa();
			solicitarNumero();
		} while (jogando);

		fimDoJogo();
	}

	private void fimDoJogo() {

		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
		tela.mesagem("Números apostados: " + numeros);

	}

	public boolean verificarMenor(int numero) {
		if (numero < numeroEscolhido)
			return true;
		return false;
	}

	public void verificarAcerto(int numero) {
		if (numero == numeroEscolhido) {
			tela.mesagem("Parabéns você acertou! número de tentativas: " + jogador.getNumeroTentativa());
			jogando = false;
		} else if (verificarMenor(numero)) {
			tela.mesagem("Deu ruim você errou, tente um número maior");
		}else { 
			tela.mesagem("Deu ruim você errou, tente número menor");
		}

	}
	

	// public void verificarAcerto() {
	// do {
	// if (solicitarNumero() == numeroEscolhido) {
	// jogador.setNumeroTentativa();
	// tela.mesagem("Parabens voce acertou! numero de tentativas: " +
	// jogador.getNumeroTentativa());
	// return;
	// } else {
	// tela.mesagem("Deu ruim, voce errou");
	// jogador.setNumeroTentativa();
	// }
	// } while (true);
	// }
}
