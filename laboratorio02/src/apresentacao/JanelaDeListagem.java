package apresentacao;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import persistencia.Reader;
import persistencia.Writer;

public class JanelaDeListagem extends JPanel{

	private Reader reader;
	private JLabel label;
	
	public JanelaDeListagem() {
		reader = new Reader();
		reader.lerDadosDosClientes("arquivos/DadosDosClientes");
		label = new JLabel(reader.getListaDeClientes().relatorioDeClientes());
		setLayout(new BorderLayout());
		this.add(label, BorderLayout.CENTER);
		setVisible(false);
		
	}
}
