package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JanelaDeAtualizacao extends JPanel implements ActionListener{

	private JButton botaoDeAtualizacao;
	public JanelaDeAtualizacao() {
		
		AreaDeDigitacao matriculaArea = new AreaDeDigitacao("   Matrícula:");
		matriculaArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		
		AreaDeDigitacao vertenteArea = new AreaDeDigitacao("   Vertente:");
		vertenteArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		
		JPanel painelAux = new JPanel();
		botaoDeAtualizacao = new JButton("   Atualizar");
		botaoDeAtualizacao.setBackground(new Color(150,191,255));
		botaoDeAtualizacao.addActionListener(this);
		
		painelAux.setLayout(new GridLayout(1,2,0,55));
		painelAux.setBackground(new Color(173, 216, 230));
		painelAux.add(new JLabel());
		painelAux.add(botaoDeAtualizacao);
		
		setBackground(new Color(173, 216, 230));
		setLayout(new GridLayout(3,1,0,138));
		this.add(matriculaArea);
		this.add(vertenteArea);
		this.add(painelAux);
		setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
