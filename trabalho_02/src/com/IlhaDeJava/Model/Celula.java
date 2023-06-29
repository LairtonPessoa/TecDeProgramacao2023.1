package com.IlhaDeJava.Model;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;

//import java.util.ArrayList;

public class Celula {

	private int posX;
	private int posY;
	private JButton botaoDaCelula;
	private ArrayList<Entidade> entidades;
	
	public Celula(int posX, int posY) {
		
		this.posX = posX;
		this.posY = posY;
		botaoDaCelula = new JButton();
		if((posX+posY)%2==0)
			botaoDaCelula.setBackground(new Color(255, 230, 100));
		else
			botaoDaCelula.setBackground(new Color(250,255,255));
		entidades = new ArrayList<Entidade>();
	}

	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public JButton getBotaoDaCelula() {
		return botaoDaCelula;
	}
	
	public ArrayList<Entidade> getEntidades() {
		return entidades;
	}
	
	public boolean temRobo() {
		for (Entidade entidade : entidades) {
			if(entidade.getTipo()==TipoDaEntidade.ROBOT)
				return true;
		}
		return false;
	}
	

	public boolean temAluno() {
		for (Entidade entidade : entidades) {
			if(entidade.getTipo()==TipoDaEntidade.ALUNO)
				return true;
		}
		return false;
	}
	
	public boolean temBug() {
		for (Entidade entidade : entidades) {
			if(entidade.getTipo()==TipoDaEntidade.BUG)
				return true;
		}
		return false;
	}
	
	public Entidade getAlunoDaCelula() {
		if(temAluno()) {
			for (Entidade entidade : entidades) {
				if(entidade.getTipo()==TipoDaEntidade.ALUNO)
					return entidade;
			}
		}
		return null;
	}
	
	public Entidade getBugDaCelula() {
		if(temBug()) {
			for (Entidade entidade : entidades) {
				if(entidade.getTipo()==TipoDaEntidade.BUG)
					return entidade;
			}
		}
		return null;
	}
	
}
