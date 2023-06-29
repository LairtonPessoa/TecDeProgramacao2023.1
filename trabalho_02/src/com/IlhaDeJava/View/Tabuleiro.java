package com.IlhaDeJava.View;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.IlhaDeJava.Model.Celula;


public class Tabuleiro extends JPanel{

	
	private ArrayList<JButton> botoesDoTabuleiro;
	private ArrayList<Celula> celulas;
	
	public Tabuleiro() {
		botoesDoTabuleiro = new ArrayList<JButton>();
		celulas = new ArrayList<Celula>();
		
		setLayout(new GridLayout(8,8));
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				Celula celula = new Celula(i, j);
				
				botoesDoTabuleiro.add(celula.getBotaoDaCelula());
				celulas.add(celula);
			}
		}
		
		for (JButton botao : botoesDoTabuleiro) {
			this.add(botao);
		}
	}

	public void setActionOnButtons(ActionListener event) {
		for (JButton botao : botoesDoTabuleiro) {
			botao.addActionListener(event);
		}
	}

	public int[] getPosXAndYOfButton(JButton botao){
		for (Celula celula : celulas) {
			if(celula.getBotaoDaCelula()==botao) {
				int[] posicaoDaCelula = {(celula.getPosX()),(celula.getPosY())};
				return posicaoDaCelula;
			}
		}
		return null;
	}

	public ArrayList<JButton> getBotoesDoTabuleiro() {
		return botoesDoTabuleiro;
	}
	
	
	
}
