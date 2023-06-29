package com.IlhaDeJava.View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.IlhaDeJava.Controller.Controlador;

public final class TelaDoJogo extends JFrame{

	private PainelLateral painelLateral;
	private PainelSuperior painelSuperior;
	public Tabuleiro tabuleiro;
	private Controlador controlador;
	private ArrayList<int[]> posicoesSelecionadas;
	private ArrayList<JButton> botoesPressionadosDoTabuleiro;
	
	
	public TelaDoJogo(Controlador controlador) {
		posicoesSelecionadas = new ArrayList<int[]>();
		botoesPressionadosDoTabuleiro = new ArrayList<JButton>();
		
		this.controlador = controlador;
		painelSuperior = new PainelSuperior(controlador);
		painelSuperior.getBotaoJogar().addActionListener(new ActionJogar());
		painelSuperior.setPreferredSize(new Dimension(200,100));
		
		tabuleiro = new Tabuleiro();
		tabuleiro.setActionOnButtons(new setIconOnTabuleiro());
		
		painelLateral = new PainelLateral(controlador);
		painelLateral.getBotaoSair().addActionListener(new ActionSairDoJogo());
		painelLateral.getBotaoVerificar().addActionListener(new ActionVerificar());
		painelLateral.getBotoaProxJogada().addActionListener(new ActionProxJogada());
		painelLateral.setPreferredSize(new Dimension(300,400));
		
		
		setLayout(new BorderLayout());
		this.add(painelSuperior, BorderLayout.NORTH);
		this.add(tabuleiro, BorderLayout.CENTER);
		this.add(painelLateral, BorderLayout.EAST);
		
		
		setSize(800,120);
		setTitle("O Resgate dos Alunos na Ilha de Java");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public ArrayList<int[]> getPosicoesSelecionadas() {
		return posicoesSelecionadas;
	}

	public ArrayList<JButton> getBotoesPressionados() {
		return botoesPressionadosDoTabuleiro;
	}
	
	public PainelLateral getPainelLateral() {
		return this.painelLateral;
	}


	private class setIconOnTabuleiro implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			try {
				JButton botaoPressionado = (JButton)e.getSource();
				painelLateral.getUltimoBotaoSelecionadoDaLateral().setEnabled(false);
				
				ImageIcon ultimoIconeAdicionado = (ImageIcon) painelLateral.getUltimoBotaoSelecionadoDaLateral().getIcon();
				Image imagemRedimensionada = ultimoIconeAdicionado.getImage().getScaledInstance(botaoPressionado.getWidth(), botaoPressionado.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon iconeRedimensionado = new ImageIcon(imagemRedimensionada);
				
				botaoPressionado.setIcon(iconeRedimensionado);
				botaoPressionado.setText(painelLateral.getUltimoBotaoSelecionadoDaLateral().getText());
				botaoPressionado.setEnabled(false);
				botoesPressionadosDoTabuleiro.add(botaoPressionado);
				
				painelLateral.setUltimoBotaoSelecionadoDaLateral(null);
			}catch (Exception exeption) {
				
			}
		}
	}
	
	private class ActionJogar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			painelSuperior.setNomeDoJogador(painelSuperior.getCaixaDeTexto().getText());
			painelSuperior.getCaixaDeTexto().setEnabled(false);
			controlador.iniciarJogador(painelSuperior.getNomeDoJogador());
			setSize(800, 600);
			setLocationRelativeTo(null);
			
		}
		
	}

	
	private class ActionSairDoJogo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int option = JOptionPane.showConfirmDialog(null, "Deseja sair do jogo ? ", "Sair", JOptionPane.YES_NO_OPTION);
			if(option==JOptionPane.YES_OPTION) {
				dispose();
				
				controlador.encerrarJogo();
				controlador.attRelatorioDasPartidas();
				
				String[] nomeDasColunas = {("Jogador"), ("Quant. de Rodadas"), ("Celulas Vazias"), ("Pontuação"),
						("Alunos Resgatados"), ("Bugs Encontrados"), ("Wall-E"), ("BB-08"), ("Bumblebee")};
				
				DefaultTableModel tableModel = new DefaultTableModel(nomeDasColunas, 0);
				for (String relatorioDeUmaPartida : controlador.getRelatorioDasPartidas()) {
					String[] dadosDaPartida = relatorioDeUmaPartida.split(";");
					
					tableModel.addRow(dadosDaPartida);
				}
				
				
				JTable table = new JTable(tableModel);
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setPreferredSize(new Dimension (950,400));
				JOptionPane.showMessageDialog(null, scrollPane, "Relatório Das Partidas", JOptionPane.INFORMATION_MESSAGE);
			}	
		}
	}
	
	private class ActionVerificar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			painelLateral.getBotaoVerificar().setEnabled(false);
			for (JButton botao : botoesPressionadosDoTabuleiro) {
				posicoesSelecionadas.add(tabuleiro.getPosXAndYOfButton(botao));
			}
			controlador.verificarRodada();
			painelLateral.attPontuacaoDosRobos();
			
			botoesPressionadosDoTabuleiro.removeAll(botoesPressionadosDoTabuleiro);
			
		}
	}
	
	private class ActionProxJogada implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			for (JButton botaoDoRobo : painelLateral.getBotoesDosRobos()) {
				botaoDoRobo.setEnabled(true);
			}
			painelLateral.getBotaoVerificar().setEnabled(true);
		}
	}
	
}
