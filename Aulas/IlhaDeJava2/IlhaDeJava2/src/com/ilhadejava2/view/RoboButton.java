package com.ilhadejava2.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.UIManager;

public class RoboButton extends JButton {
	private int id;
	
    public RoboButton(Icon icon, int id) {
    	this.id = id;
        setIcon(icon);
        setBorderPainted(false);
//        setContentAreaFilled(false);
        setFocusPainted(false);
//        setOpaque(false);
        setPreferredSize(new Dimension(30, 30));
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(UIManager.getColor("Button.background").darker());
        } else if (getModel().isRollover()) {
            g.setColor(UIManager.getColor("Button.background").brighter());
        } else {
            g.setColor(UIManager.getColor("Button.background"));
        }
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    
}
