package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import persistencia.Reader;
import persistencia.Writer;

public class JanelaDeExclusao extends JPanel implements ActionListener{

	private JButton botaoDeExclusao;
	private Reader reader;
	private AreaDeDigitacao matriculaArea;
	
	public JanelaDeExclusao() {
		reader = new Reader();
		
		matriculaArea = new AreaDeDigitacao("   Matrícula:");
		matriculaArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		
		JPanel painelAux = new JPanel();
		botaoDeExclusao = new JButton("   Excluir");
		botaoDeExclusao.setBackground(new Color(150,191,255));
		botaoDeExclusao.addActionListener(this);
		
		painelAux.setLayout(new GridLayout(1,2,0,55));
		painelAux.setBackground(new Color(173, 216, 230));
		painelAux.add(new JLabel());
		painelAux.add(botaoDeExclusao);
		
		setBackground(new Color(173, 216, 230));
		setLayout(new GridLayout(2,1,0,305));
		this.add(matriculaArea);
		this.add(painelAux);
		setVisible(false);
	}


	public void actionPerformed(ActionEvent e) {
		reader.exclusaoDeAluno("dados/dadosDosAlunos.txt", matriculaArea.getTextoEscrito());
		
		matriculaArea.removeTextOfTextBox();
		
	}
}
