package com.IlhaDeJava.Model;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import com.IlhaDeJava.View.Tabuleiro;

public class Plano {

	
	private ArrayList<Celula> celulas;
	private ArrayList<Robot> robos;
	public ArrayList<Entidade> alunosEBugs;
	private Tabuleiro tabuleiro;
	
	public Plano() {
		
		celulas = new ArrayList<Celula>();
		robos = new ArrayList<Robot>();
		alunosEBugs = new ArrayList<Entidade>();
		tabuleiro = new Tabuleiro();
		
		robos.add(new Robot(TipoDaEntidade.ROBOT, "Wall-E", 0, 0, new ImageIcon("Wall-E-Robot.png"), this));
		robos.add(new Robot(TipoDaEntidade.ROBOT, "BB-08", 0, 0, new ImageIcon("BB-08.png"), this));
		robos.add(new Robot(TipoDaEntidade.ROBOT, "Bumblebee", 0, 0, new ImageIcon("bumblebee.png"), this));
		
		
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				celulas.add(new Celula(i, j));
			}
		}
		
		this.instanciarAlunosEBugs();
		
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}


	public ArrayList<Celula> getCelulas() {
		return celulas;
	}
	
	public ArrayList<Robot> getRobos() {
		return robos;
	}

	public void attPosOfRobots(int[] posicao, String nome) {
		for (Robot robo : robos) {
			if(robo.getNome().equals(nome)) {
				robo.setPosicaoXdaEntidade(posicao[0]);
				robo.setPosicaoYdaEntidade(posicao[1]);
				robo.atribuirEntidadeACelula();
				robo.computarPontuacao();
			}
		}
	}
	
	public void instanciarAlunosEBugs() {
		Random random = new Random();
		boolean controle=false;
		
		for (int i = 1; i <= 15; i++) {
			controle=false;
			do {
				int posX = random.nextInt(1, 8);
				int posY = random.nextInt(1, 8);
				for (Celula celula : celulas) {
					if((celula.getPosX()==posX&&celula.getPosY()==posY)&&(celula.temAluno()==false&&celula.temBug()==false)) {
						AlunoOuBug aluno = new AlunoOuBug(TipoDaEntidade.ALUNO, posX, posY, new ImageIcon("bonequinhoDoAluno.png"), this);
						alunosEBugs.add(aluno);
						aluno.atribuirEntidadeACelula();
						controle=true;
					}
				}
			}while(!controle);
		}
		for (int i = 1; i <= 10; i++) {
			controle=false;
			do {
				int posX = random.nextInt(1, 8);
				int posY = random.nextInt(1, 8);	
				for (Celula celula : celulas) {
					if((celula.getPosX()==posX&&celula.getPosY()==posY)&&(celula.temAluno()==false&&celula.temBug()==false)) {
						AlunoOuBug bug = new AlunoOuBug(TipoDaEntidade.BUG, posX, posY, new ImageIcon("bonequinhoDoBug.png"), this);
						alunosEBugs.add(bug);
						bug.atribuirEntidadeACelula();
						controle=true;
					}
				}
			}while(!controle);
		}
	}
	
}
