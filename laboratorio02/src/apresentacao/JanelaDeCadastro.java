package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import negocio.Cliente;
import negocio.ListaDeClientes;
import persistencia.Writer;

public class JanelaDeCadastro extends JPanel implements ActionListener{

	private JButton botaoDeCadastro;
	private Writer writer;
	private AreaDeDigitacao nameArea;
	private AreaDeDigitacao cpfArea;
	private AreaDeDigitacao matriculaArea;
	private AreaDeDigitacao vertenteArea;
	private ListaDeClientes listaClientes;
	
	
	
	public JanelaDeCadastro() {
		writer = new Writer();
		listaClientes = new ListaDeClientes();
		nameArea = new AreaDeDigitacao("   Nome:");
		nameArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		
		
		cpfArea = new AreaDeDigitacao("   CPF:");
		cpfArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		
		
		matriculaArea = new AreaDeDigitacao("   Matrícula:");
		matriculaArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		
		
		vertenteArea = new AreaDeDigitacao("   Vertente:");
		vertenteArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		
		
		JPanel painelAux = new JPanel();
		botaoDeCadastro = new JButton("   Cadastrar");
		botaoDeCadastro.setBackground(new Color(150,191,255));
		botaoDeCadastro.addActionListener(this);
		
		painelAux.setLayout(new GridLayout(1,2,0,55));
		painelAux.setBackground(new Color(173, 216, 230));
		painelAux.add(new JLabel());
		painelAux.add(botaoDeCadastro);
		
		
		setLayout(new GridLayout(5, 1, 0, 55));
		setBackground(new Color(173, 216, 230));
		
		this.add(nameArea);
		this.add(cpfArea);
		this.add(matriculaArea);
		this.add(vertenteArea);
		this.add(painelAux);
		
		setVisible(false);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		String textoDigitado="";
		Cliente cliente = new Cliente(nameArea.getTextoEscrito(), cpfArea.getTextoEscrito(), Integer.parseInt(matriculaArea.getTextoEscrito()), vertenteArea.getTextoEscrito());
		listaClientes.addClienteToList(cliente);
		
		writer.writeData("dados/dadosDosAlunos.txt", listaClientes.relatorioDeClientes(), false);
		
		nameArea.removeTextOfTextBox();
		cpfArea.removeTextOfTextBox();
		matriculaArea.removeTextOfTextBox();
		vertenteArea.removeTextOfTextBox();
	}
}
