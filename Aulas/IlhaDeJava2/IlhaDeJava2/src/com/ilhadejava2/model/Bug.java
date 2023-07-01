package com.ilhadejava2.model;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.ilhadejava2.view.Icon;

public class Bug implements GameElement{
	
    Icon bugIcon = new Icon("C:\\Users\\jpnno\\eclipse-workspace\\IlhaDeJava2\\src\\resources\\bug.png", 40, 40);
	
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 2;
	}


	public ImageIcon getIcon() {
		return bugIcon;
	}


	public void setIcon(Icon icon) {
		this.bugIcon = icon;
	}
	
	

}
