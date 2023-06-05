package apresentacao;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class PainelInferior extends JPanel{

	private JanelaDeCadastro janelaDeCadastro;
	private JanelaDeAtualizacao janelaDeAtualizacao;
	private JanelaDeListagem janelaDeListagem;
	private JanelaDeExclusao janelaDeExclusao;
	private JPanel painelAux;
	
	public PainelInferior() {
		
		janelaDeCadastro = new JanelaDeCadastro();
		janelaDeListagem = new JanelaDeListagem();
		janelaDeAtualizacao = new JanelaDeAtualizacao();
		janelaDeExclusao = new JanelaDeExclusao();
		painelAux = new JPanel();
		painelAux.setVisible(true);
		janelaDeCadastro.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
		janelaDeListagem.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
		janelaDeAtualizacao.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
		janelaDeExclusao.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
		
		setLayout(new CardLayout());
		this.add(painelAux);
		this.add(janelaDeAtualizacao);
		this.add(janelaDeCadastro);
		this.add(janelaDeExclusao);
		this.add(janelaDeListagem);
		setVisible(true);
	}
	
	public void setShowJanelaDeCadastro() {
		painelAux.setVisible(false);
		janelaDeAtualizacao.setVisible(false);
		janelaDeExclusao.setVisible(false);
		janelaDeListagem.setVisible(false);
		janelaDeCadastro.setVisible(true);
	}
	
	public void setShowJanelaDeAtualizacao() {
		painelAux.setVisible(false);
		janelaDeCadastro.setVisible(false);
		janelaDeExclusao.setVisible(false);
		janelaDeListagem.setVisible(false);
		janelaDeAtualizacao.setVisible(true);
	}
	
	public void setShowJanelaDeExclusao() {
		painelAux.setVisible(false);
		janelaDeCadastro.setVisible(false);
		janelaDeAtualizacao.setVisible(false);
		janelaDeListagem.setVisible(false);
		janelaDeExclusao.setVisible(true);
	}
	
	public void setShowJanelaDeListagem() {
		painelAux.setVisible(false);
		janelaDeCadastro.setVisible(false);
		janelaDeAtualizacao.setVisible(false);
		janelaDeExclusao.setVisible(false);
		janelaDeListagem.setVisible(true);
	}
}
