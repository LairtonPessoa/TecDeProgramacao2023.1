package com.ilhadejava2.model;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Cell {
	private int x;
	private int y;
	private GameElement content; 
	public JButton Button = new JButton();
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public GameElement getContent() {
		return content;
	}

	public void setContent(GameElement content) {
		this.content = content;
	}
	
	


	
	
}
