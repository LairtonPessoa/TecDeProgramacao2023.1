package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

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
		caixaDeTexto.setPreferredSize(new Dimension(200, 10));
		setBackground(new Color(173, 216, 230));
		
		setLayout(new BorderLayout());
		this.add(this.textoDeExibicao, BorderLayout.WEST);
		this.add(caixaDeTexto, BorderLayout.EAST);
	}

	public String getTextoEscrito() {
		return caixaDeTexto.getText();
	}
	
	
}
