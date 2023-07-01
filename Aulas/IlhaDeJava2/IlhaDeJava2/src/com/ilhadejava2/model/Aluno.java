package com.ilhadejava2.model;
import java.awt.Image;

import com.ilhadejava2.view.Icon;

public class Aluno implements GameElement{
    
    Icon alunoIcon = new Icon("C:\\Users\\jpnno\\eclipse-workspace\\IlhaDeJava2\\src\\resources\\aluno.png", 40, 40);
	
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 1;
	}

	public Icon getIcon() {
		return alunoIcon;
	}

	public void setIcon(Icon icon) {
		this.alunoIcon = icon;
	}
	
	
}
