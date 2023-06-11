package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AreaDeDigitacao extends JPanel{

	private JLabel textoDeExibicao;
	private JTextField caixaDeTexto;
	
	public AreaDeDigitacao(String textoDeExibicao) {
		this.textoDeExibicao = new JLabel(textoDeExibicao);
		caixaDeTexto = new JTextField(20);
		
		//caixaDeTexto.setPreferredSize(new Dimension(200, 10));
		setBackground(new Color(173, 216, 230));
		
		setLayout(new GridLayout(1,2,0,50));
		this.add(this.textoDeExibicao);
		this.add(caixaDeTexto);
		
	}

	public String getTextoEscrito() {
		return caixaDeTexto.getText();
	}
	
	public void removeTextOfTextBox() {
		caixaDeTexto.setText("");
	}
	
	
}
