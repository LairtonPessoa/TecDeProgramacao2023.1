package apresentacao;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JanelaDeExclusao extends JPanel implements ActionListener{

	private JButton botaoExclusao;
	
	public JanelaDeExclusao() {
		AreaDeDigitacao matriculaArea = new AreaDeDigitacao(" Matrícula:");
		matriculaArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		
		botaoExclusao = new JButton("Excluir");
		botaoExclusao.addActionListener(this);
		
		setLayout(new GridLayout(2,1));
		this.add(matriculaArea);
		this.add(botaoExclusao);
		setVisible(false);
	}


	public void actionPerformed(ActionEvent e) {
		
		
	}
}
