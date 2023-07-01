package com.IlhaDeJava.View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.IlhaDeJava.Controller.Controlador;

public class PainelSuperior extends JPanel implements ActionListener{

	private JLabel labelNomeDoJogador;
	private JTextField caixaDeTexto;
	private JButton jogar, relatorioDoJogo;
	private String nomeDoJogador;
	private Controlador controlador;
	
	public PainelSuperior(Controlador controlador) {
		this.controlador=controlador;
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.weightx = 2;
		labelNomeDoJogador = new JLabel("Nome do Jogador: ");
		this.add(labelNomeDoJogador, gbc);
		
		gbc.gridx = 1;
		
		caixaDeTexto = new JTextField(20);
		caixaDeTexto.setPreferredSize(new Dimension(100,25));
		this.add(caixaDeTexto, gbc);
		
		gbc.gridx = 2;
		
		jogar = new JButton("Jogar");
		jogar.setBackground(new Color(255, 230, 100));
		jogar.setPreferredSize(new Dimension(100,25));
		this.add(jogar, gbc);
		
		gbc.gridx = 3;
		
		relatorioDoJogo = new JButton("Relatório do Jogo");
		relatorioDoJogo.setBackground(new Color(255, 230, 100));
		relatorioDoJogo.setPreferredSize(new Dimension(150,25));
		relatorioDoJogo.addActionListener(this);
		this.add(relatorioDoJogo, gbc);
		
		setBackground(new Color(255, 255, 0));
		
		this.setVisible(true);
	}

	public JButton getBotaoJogar() {
		return jogar;
	}
	
	public JTextField getCaixaDeTexto() {
		return caixaDeTexto;
	}

	public String getNomeDoJogador() {
		return nomeDoJogador;
	}
	
	public void setNomeDoJogador(String nomeDoJogador) {
		this.nomeDoJogador=nomeDoJogador;
	}

	
	public void actionPerformed(ActionEvent e) {
		try {
			String relatorioDaPartida = "Nome do(a) jogador(a): " + controlador.getJogador().getNome()
					+ "\nRodadas: " + controlador.getJogador().getRodadas() + "\nCelulas Visitadas Vazias: "
					+ controlador.getNumeroDeCelulasVisitadasVazias() + "\nPontuação do(a) jogador(a): "
					+ controlador.getJogador().getPontuacaoDoJogador() + "\nAlunos Encontrados: " + controlador.getAlunosEncontrados()
					+ "\nBugs Encontrados: " + controlador.getBugsEncontrados() + "\nPontuação do Wall-E: "
					+ controlador.getPontuacaoDoWalle() + "\nPontuação do BB-08: " + controlador.getPontuacaoDoBb08()
					+ "\nPontuação do Bumblebee: " + controlador.getPontuacaoDoBumblebee();
	
			JOptionPane.showMessageDialog(null, relatorioDaPartida, "Relatório atual da Partida", JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception ex) {
			
		}
	}
	
}
