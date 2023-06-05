package apresentacao;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JanelaDeAtualizacao extends JPanel implements ActionListener{

	private JButton botaoDeAtualizacao;
	public JanelaDeAtualizacao() {
		
		AreaDeDigitacao matriculaArea = new AreaDeDigitacao(" Matrícula:");
		matriculaArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		
		AreaDeDigitacao vertenteArea = new AreaDeDigitacao(" Vertente:");
		vertenteArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		
		botaoDeAtualizacao = new JButton(" Atualizar");
		botaoDeAtualizacao.addActionListener(this);
		
		setLayout(new GridLayout(3,1));
		this.add(matriculaArea);
		this.add(vertenteArea);
		this.add(botaoDeAtualizacao);
		setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
