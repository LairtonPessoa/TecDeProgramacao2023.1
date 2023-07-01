package visualizacao;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaFrame extends JFrame{

	public JanelaFrame() {
		setSize(400, 400);
		JLabel label = new JLabel("Teste");
		this.add(label);
		this.setVisible(true);
		
	}
}
