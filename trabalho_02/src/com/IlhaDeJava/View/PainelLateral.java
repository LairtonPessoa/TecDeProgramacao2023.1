package com.IlhaDeJava.View;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.IlhaDeJava.Controller.Controlador;

public class PainelLateral extends JPanel{

	private Controlador controlador;
	private JPanel painelPontuacaoDoJogador;
	private JLabel pontuacaoDoJogador;
	private JPanel alunosEBugsEncontrados;
	private JLabel alunosEncontrados;
	private JLabel bugsEncontrados;
	private JPanel pontuacaoDosRobos;
	private JPanel painelBotoesDosRobos;
	private ArrayList<JButton> botoesDosRobos;
	private JLabel labelWalle;
	private JLabel labelBb08;
	private JLabel labelBumblebee;
	private JButton botaoVerificar;
	private JButton botaoProxJogada;
	private JButton botaoSair;
	private Color background;
	private JButton ultimoBotaoSelecionadoDaLateral;
	
	
	
	public PainelLateral(Controlador controlador) {
		this.controlador = controlador;
		botoesDosRobos = new ArrayList<JButton>();
		
		background = new Color(245,255,255);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weighty = 1;
		gbc.fill = gbc.BOTH;
		gbc.anchor = gbc.WEST;
		pontuacaoDoJogador = new JLabel("Pontuacao: ");
		painelPontuacaoDoJogador = new JPanel();
		painelPontuacaoDoJogador.add(pontuacaoDoJogador);
		this.add(pontuacaoDoJogador, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.1;
		gbc.anchor = gbc.WEST;
		alunosEncontrados = new JLabel("Alunos: " + controlador.getAlunosEncontrados(), new ImageIcon("bonequinhoDoAluno.png"), BoxLayout.X_AXIS);
		bugsEncontrados = new JLabel("Bugs: " + controlador.getBugsEncontrados(), new ImageIcon("bonequinhoDoBug.png"), BoxLayout.X_AXIS);
		alunosEBugsEncontrados = new JPanel();
		alunosEBugsEncontrados.setLayout(new GridBagLayout());
		alunosEBugsEncontrados.add(alunosEncontrados, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 2;
		gbc.anchor = gbc.EAST;
		alunosEBugsEncontrados.add(bugsEncontrados, gbc);
		alunosEBugsEncontrados.setBackground(background);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(alunosEBugsEncontrados, gbc);
		
		
		labelWalle = new JLabel(Integer.toString(controlador.getPontuacaoDoWalle()), new ImageIcon("Wall-E-Robot.png"), gbc.CENTER);
		labelBb08 = new JLabel(Integer.toString(controlador.getPontuacaoDoBb08()), new  ImageIcon("BB-08.png"), gbc.CENTER);
		labelBumblebee = new JLabel(Integer.toString(controlador.getPontuacaoDoBumblebee()), new ImageIcon("bumblebee.png"), gbc.CENTER);
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		pontuacaoDosRobos = new JPanel();
		pontuacaoDosRobos.setLayout(new GridBagLayout());
		pontuacaoDosRobos.add(labelWalle, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1;
		pontuacaoDosRobos.add(labelBb08, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.weightx = 2;
		pontuacaoDosRobos.add(labelBumblebee, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = gbc.BOTH;
		gbc.weighty = 1;
		
		pontuacaoDosRobos.setBackground(background);
		this.add(pontuacaoDosRobos, gbc);
		
		
		JButton botaoWalle = new JButton("Wall-E", new ImageIcon("Wall-E-Robot.png"));
		botaoWalle.setPreferredSize(new Dimension(100,115));
		botaoWalle.setBackground(new Color(255, 230, 100));
		botaoWalle.addActionListener(new SelecionarIcone());
		botoesDosRobos.add(botaoWalle);
		
		JButton botaoBb08 = new JButton("BB-08", new ImageIcon("BB-08.png"));
		botaoBb08.setPreferredSize(new Dimension(100,115));
		botaoBb08.setBackground(new Color(255, 230, 100));
		botaoBb08.addActionListener(new SelecionarIcone());
		botoesDosRobos.add(botaoBb08);
		
		JButton botaoBumblebee = new JButton("Bumblebee", new ImageIcon("bumblebee.png"));
		botaoBumblebee.setPreferredSize(new Dimension(100,115));
		botaoBumblebee.setBackground(new Color(255, 230, 100));
		botaoBumblebee.addActionListener(new SelecionarIcone());
		botoesDosRobos.add(botaoBumblebee);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = gbc.BOTH;
		gbc.weighty = 0;
		painelBotoesDosRobos = new JPanel();
		painelBotoesDosRobos.setPreferredSize(new Dimension(300,115));
		painelBotoesDosRobos.setLayout(new GridBagLayout());
		painelBotoesDosRobos.add(botaoWalle, gbc);
		painelBotoesDosRobos.setBackground(background);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = gbc.BOTH;
		painelBotoesDosRobos.add(botaoBb08, gbc); 
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.fill = gbc.BOTH;
		painelBotoesDosRobos.add(botaoBumblebee, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weighty = 1;
		this.add(painelBotoesDosRobos, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.fill = 0;
		gbc.weighty = 1;
		gbc.anchor = gbc.CENTER;
		botaoVerificar = new JButton("Verificar");
		botaoVerificar.setPreferredSize(new Dimension(150,40));
		botaoVerificar.setBackground(new Color(255, 230, 100));
		this.add(botaoVerificar, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.fill = 0;
		gbc.weighty = 1;
		gbc.anchor = gbc.CENTER;
		botaoProxJogada = new JButton("Próxima Jogada");
		botaoProxJogada.setPreferredSize(new Dimension(150,40));
		botaoProxJogada.setBackground(new Color(255, 230, 100));
		this.add(botaoProxJogada, gbc);
		
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.weighty = 1;
		botaoSair = new JButton("Sair");
		botaoSair.setPreferredSize(new Dimension(150,40));
		botaoSair.setBackground(new Color(255, 230, 100));
		this.add(botaoSair, gbc);
		this.setBackground(background);
	}

	public JButton getBotaoVerificar() {
		return botaoVerificar;
	}

	public JButton getBotaoSair() {
		return botaoSair;
	}

	public JButton getBotoaProxJogada() {
		return botaoProxJogada;
	}
	public JButton getUltimoBotaoSelecionadoDaLateral() {
		return ultimoBotaoSelecionadoDaLateral;
	}
	
	public JPanel getPainelDosRobos() {
		return painelBotoesDosRobos;
	}
	
	public ArrayList<JButton> getBotoesDosRobos(){
		return botoesDosRobos;
	}

	public void setUltimoBotaoSelecionadoDaLateral(JButton ultimoBotaoSelecionadoDaLateral) {
		this.ultimoBotaoSelecionadoDaLateral = ultimoBotaoSelecionadoDaLateral;
	}
	
	public void attPontuacaoDosRobos() {
		pontuacaoDoJogador.setText("Pontuação: " + controlador.getJogador().getPontuacaoDoJogador());
		
		alunosEncontrados.setText("Alunos: " + controlador.getAlunosEncontrados());
		bugsEncontrados.setText("Bugs: " + controlador.getBugsEncontrados());
		
		labelWalle.setText(Integer.toString(controlador.getPontuacaoDoWalle()));
		labelBb08.setText(Integer.toString(controlador.getPontuacaoDoBb08()));
		labelBumblebee.setText(Integer.toString(controlador.getPontuacaoDoBumblebee())); 
		
		
		
		revalidate();
		repaint();
	}

	private class SelecionarIcone implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			ultimoBotaoSelecionadoDaLateral = (JButton) e.getSource();
		}
	}
	
}
