package com.ilhadejava2.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.ilhadejava2.model.Cell;

public class GameBoard extends JPanel {

	public Cell getCell(int x, int y) {
		Component[] components = getComponents();

		for (Component component : components) {
			if (component instanceof JButton) {
				JButton button = (JButton) component;
				Cell cell = (Cell) button.getClientProperty("cell");

				if (cell.getX() == x && cell.getY() == y) {
					return cell;
				}
			}
		}

		return null; 
	}

	public GameBoard() {
		setLayout(new GridLayout(8, 8));

		ArrayList<JButton> buttons = new ArrayList<>();
		ArrayList<Color> colors = new ArrayList<>(); 

		colors.add(Color.GREEN);
		colors.add(Color.ORANGE);
		colors.add(Color.MAGENTA);

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				Cell cell = new Cell(i, j);

				cell.Button.putClientProperty("cell", cell);
				cell.Button.setPreferredSize(new Dimension(500, 500));
				cell.Button.setBorderPainted(false);

				add(cell.Button);

				if ((i + j) % 2 == 0) {
					cell.Button.setBackground(Color.WHITE);
				} else {
					cell.Button.setBackground(Color.BLUE);
				}

			}
		}

	}
}
