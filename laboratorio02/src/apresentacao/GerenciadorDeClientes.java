package apresentacao;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GerenciadorDeClientes extends JFrame{

	
	private JPanel painelSuperior;
	private PainelInferior painelInferior;
	
	
	public GerenciadorDeClientes() {
		
		setSize(500, 500);
		setTitle("Gerenciador de Clientes");
		criarPainelSuperior();
		
		
		painelInferior = new PainelInferior();
		painelInferior.setPreferredSize(new Dimension(this.getWidth(), 400));;
		painelInferior.setVisible(true);
		painelInferior.setBackground(new Color(50, 50, 50));
		
		setLayout(new BorderLayout());
		this.add(painelSuperior, BorderLayout.NORTH);
		this.add(painelInferior, BorderLayout.CENTER);
//		this.add(janelaDeListagem, BorderLayout.CENTER);
//		this.add(janelaDeAtualizacao, BorderLayout.CENTER);
//		this.add(janelaDeExclusao, BorderLayout.CENTER);
		
		
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void criarPainelSuperior() {
		painelSuperior = new JPanel();
		painelSuperior.setPreferredSize(new Dimension(this.getWidth(), 100));
		painelSuperior.setBackground(new Color(20, 200,255));
		
		JButton botaoCadastro = gerarBotao("Cadastrar", new Color(150,191,255), 100, 30);
		botaoCadastro.addActionListener(new ShowJanelaDeCadastro());
		
		JButton botaoListar = gerarBotao("Listar", new Color(150,191,255), 100, 30);
		botaoListar.addActionListener(new ShowJanelaDeListagem());
		
		JButton botaoAtualizar = gerarBotao("Atualizar", new Color(150,191,255), 100, 30);
		botaoAtualizar.addActionListener(new ShowJanelaDeAtualizacao());
		
		JButton botaoDeletar = gerarBotao("Deletar", new Color(150,191,255), 100, 30);
		botaoDeletar.addActionListener(new ShowJanelaDeExclusao());
		
		
		painelSuperior.add(botaoCadastro);
		painelSuperior.add(botaoListar);
		painelSuperior.add(botaoAtualizar);
		painelSuperior.add(botaoDeletar);
	}

//	public void organizador(LayoutManager organizador) {
//	
//		
//		painelInferior.add(painelCadastro);
//		painelInferior.add(painelListarDados);
//		painelInferior.add(painelAtualizarDados);
//		painelInferior.add(painelLimpar);
//
//		this.setLayout(new BorderLayout());
//		this.add(painelSuperior, BorderLayout.NORTH);
//		this.add(painelInferior, BorderLayout.CENTER);
//	}
	
	public JButton gerarBotao(String text, Color background, int width, int height) {
		JButton botao = new JButton(text);
		botao.setBackground(background);
		botao.setPreferredSize(new Dimension(width, height));
		
		return botao;
	}
	
	private class ShowJanelaDeCadastro implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			painelInferior.setShowJanelaDeCadastro();
		}
	}
	
	private class ShowJanelaDeListagem implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			painelInferior.setShowJanelaDeListagem();
		}
	}
	
	private class ShowJanelaDeAtualizacao implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			painelInferior.setShowJanelaDeAtualizacao();
		}
	}
	
	private class ShowJanelaDeExclusao implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			painelInferior.setShowJanelaDeExclusao();
		}
	}
}
