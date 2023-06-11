package apresentacao;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class PainelInferior extends JPanel{

	protected JanelaDeCadastro janelaDeCadastro;
	protected JanelaDeAtualizacao janelaDeAtualizacao;
	protected JanelaDeListagem janelaDeListagem;
	protected JanelaDeExclusao janelaDeExclusao;
	private JPanel painelAux;
	
	public PainelInferior() {
		
		janelaDeCadastro = new JanelaDeCadastro();
		janelaDeListagem = new JanelaDeListagem();
		janelaDeAtualizacao = new JanelaDeAtualizacao();
		janelaDeExclusao = new JanelaDeExclusao();
		painelAux = new JPanel();
		painelAux.setVisible(true);
		painelAux.setBackground(new Color(173, 216, 230));
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
		this.revalidate();
		this.repaint();
	}
}
