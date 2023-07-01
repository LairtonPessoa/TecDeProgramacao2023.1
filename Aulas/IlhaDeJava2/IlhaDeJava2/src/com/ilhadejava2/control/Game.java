package com.ilhadejava2.control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import com.ilhadejava2.view.EscolhaRobo;
import com.ilhadejava2.view.GameBoard;

public class Game extends JFrame {
	private GameBoard board;
	private GameManager manager;

	public Game() {
		super("ILHA DE JAVA 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 450);

		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(Color.RED);
		panelNorth.setPreferredSize(new Dimension(getWidth(), 70));

		manager = new GameManager();
		board = new GameBoard();
		manager.populateBoard(board);

		JPanel panelEast = new EscolhaRobo(board);
		panelEast.setPreferredSize(new Dimension(130, getHeight()));

		setLayout(new BorderLayout());
		add(panelNorth, BorderLayout.NORTH);
		add(board, BorderLayout.CENTER);
		add(panelEast, BorderLayout.EAST);

		setVisible(true);
	}

}
