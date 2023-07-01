package com.IlhaDeJava.Model;

import javax.swing.ImageIcon;

public class Robot extends Entidade{

	protected int pontuacao;
	private int alunosEncontradosPeloRobot;
	private int bugsEncontradosPeloRobot;
	private int celulasVisitadasVazias;
	
	
	public Robot(TipoDaEntidade tipo, String nome,int posX, int posY, ImageIcon icon, Plano plano) {
		super(tipo, posX, posY, icon, plano);
		this.nome=nome;
		
	}
	
	public int getAlunosEncontradosPeloRobot() {
		return alunosEncontradosPeloRobot;
	}

	public int getBugsEncontradosPeloRobot() {
		return bugsEncontradosPeloRobot;
	}
	
	public int getCelulasVisitadasVazias() {
		return celulasVisitadasVazias;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}

	public void incrementarPontuacao() {
		pontuacao+=10;
	}
	
	public void decrementarPontuacao() {
		pontuacao-=15;
	}
	
	public void computarPontuacao() {
		if(this.getCelulaAtualDaEntidade().temAluno()||this.getCelulaAtualDaEntidade().temBug()) {
			if(this.getCelulaAtualDaEntidade().temAluno()) {
				alunosEncontradosPeloRobot++;
				this.incrementarPontuacao();
				this.getCelulaAtualDaEntidade().getEntidades().remove(this.getCelulaAtualDaEntidade().getAlunoDaCelula());
			}
			if(this.getCelulaAtualDaEntidade().temBug()) {
				bugsEncontradosPeloRobot++;
				this.decrementarPontuacao();
				this.getCelulaAtualDaEntidade().getEntidades().remove(this.getCelulaAtualDaEntidade().getBugDaCelula());
			}
		}else {
			celulasVisitadasVazias++;
		}
	}

	
	
}
