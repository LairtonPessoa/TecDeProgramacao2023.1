package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import negocio.Cliente;
import persistencia.Reader;

public class JanelaDeListagem extends JPanel{

	private ArrayList<JLabel> dados;
	private Reader reader;
	private JLabel label;
	
	public JanelaDeListagem() {
		reader = new Reader();
		reader.lerDadosDosClientes("dados/dadosDosAlunos.txt");
		dados = new ArrayList<JLabel>();
		
		setBackground(new Color(173, 216, 230));
		setVisible(false);
		
	}
	
	public void attJanela() {
		for (JLabel jLabel : dados) {
			this.remove(jLabel);
		}
		dados.clear();
			
		reader.getListaDeClientes().listaClientes.clear();
		reader.lerDadosDosClientes("dados/dadosDosAlunos.txt");
		
		for (Cliente cliente : reader.getListaDeClientes().listaClientes) {
			label = new JLabel("Nome: " + cliente.getName() + " CPF: " + cliente.getCpf() + " Matrícula: " + cliente.getMatricula() + " Vertente: " + cliente.getVertente());
			label.setPreferredSize(new Dimension(450,30));
			this.add(label);
			dados.add(label);
		}
			
		this.revalidate();
		this.repaint();
	}
}
