package com.IlhaDeJava.Controller;

import java.util.ArrayList;

import javax.swing.JButton;

import com.IlhaDeJava.Model.Entidade;
import com.IlhaDeJava.Model.Jogador;
import com.IlhaDeJava.Model.Plano;
import com.IlhaDeJava.Model.Leitora;
import com.IlhaDeJava.Model.Robot;
import com.IlhaDeJava.Model.Escritor;
import com.IlhaDeJava.View.TelaDoJogo;

public final class Controlador{

	private TelaDoJogo telaDoJogo;
	private Plano planoDoJogo;
	private Escritor writer;
	private Leitora reader;
	private Jogador jogador;
	private int pontuacaoDoWalle;
	private int pontuacaoDoBb08;
	private int pontuacaoDoBumblebee;
	private int alunosEncontrados;
	private int bugsEncontrados;
	private int numeroDeCelulasVisitadasVazias;
	private ArrayList<String> relatorioDasPartidas;
	
	
	public Controlador() {
		planoDoJogo = new Plano();
		telaDoJogo = new TelaDoJogo(this);
		writer = new Escritor();
		reader = new Leitora();
		relatorioDasPartidas = new ArrayList<String>();
		addAlunoEBugsNaTela();
		
	}
	
	public int getPontuacaoDoWalle() {
		return pontuacaoDoWalle;
	}

	public int getPontuacaoDoBb08() {
		return pontuacaoDoBb08;
	}

	public int getPontuacaoDoBumblebee() {
		return pontuacaoDoBumblebee;
	}

	
	public int getAlunosEncontrados(){
		return alunosEncontrados;
	}

	public int getBugsEncontrados() {
		return bugsEncontrados;
	}
	
	public Jogador getJogador() {
		return jogador;
	}	
	
	public int getNumeroDeCelulasVisitadasVazias() {
		return numeroDeCelulasVisitadasVazias;
	}
	
	public ArrayList<String> getRelatorioDasPartidas(){
		return relatorioDasPartidas;
	}
	
	public Plano getPlano() {
		return planoDoJogo;
	}
	
	public void iniciarJogador(String nome) {
		jogador = new Jogador(nome);
	}

	public void addAlunoEBugsNaTela() {
		
		for (Entidade alunoOuBug : planoDoJogo.alunosEBugs) {
			for (JButton botaoDoTabuleiro : telaDoJogo.tabuleiro.getBotoesDoTabuleiro()) {
				if(alunoOuBug.getPosicaoXdaEntidade()==telaDoJogo.tabuleiro.getPosXAndYOfButton(botaoDoTabuleiro)[0]&&alunoOuBug.getPosicaoYdaEntidade()==telaDoJogo.tabuleiro.getPosXAndYOfButton(botaoDoTabuleiro)[1]) {
					botaoDoTabuleiro.setIcon(alunoOuBug.getIconeDaEntidade());
				}
			}
		}
	}
	
	public void verificarRodada() {
		for (JButton botao : telaDoJogo.getBotoesPressionados()) {
				planoDoJogo.attPosOfRobots(telaDoJogo.tabuleiro.getPosXAndYOfButton(botao), botao.getText());
		}
		
		alunosEncontrados = 0;
		bugsEncontrados = 0;
		numeroDeCelulasVisitadasVazias = 0;
		for (Robot robo : planoDoJogo.getRobos()) {
		 	if(robo.getNome().equals("Wall-E")) 
		 		pontuacaoDoWalle=robo.getPontuacao();
		 	if(robo.getNome().equals("BB-08"))  
		 		pontuacaoDoBb08=robo.getPontuacao();
		 	if(robo.getNome().equals("Bumblebee"))  
		 		pontuacaoDoBumblebee=robo.getPontuacao();
		 	alunosEncontrados+=robo.getAlunosEncontradosPeloRobot();
		 	bugsEncontrados+=robo.getBugsEncontradosPeloRobot();
		 	numeroDeCelulasVisitadasVazias+=robo.getCelulasVisitadasVazias();
		}	
		jogador.setPontuacaoDoJogador(pontuacaoDoWalle+pontuacaoDoBb08+pontuacaoDoBumblebee);;
		jogador.setRodadas(jogador.getRodadas()+1);
		
	}
	
	
	
	public void attRelatorioDasPartidas() {
		reader.lerDadosDosClientes("dados/dadosDasPartidas.txt");
		relatorioDasPartidas = reader.getRelatorioDasPartidas();
	}
	
	public void encerrarJogo() {
		String relatorioDeUmaPartida =jogador.getNome() + ";" + jogador.getRodadas() + ";" + numeroDeCelulasVisitadasVazias 
										+ ";" + jogador.getPontuacaoDoJogador()+ ";" + alunosEncontrados + ";" + bugsEncontrados  
										+ ";" + pontuacaoDoWalle + ";" + pontuacaoDoBb08 + ";" +pontuacaoDoBumblebee + "\n";
			writer.writeData("dados/dadosDasPartidas.txt", relatorioDeUmaPartida);
	}
	
}
 