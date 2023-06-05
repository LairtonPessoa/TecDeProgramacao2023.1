package apresentacao;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import persistencia.Writer;

public class JanelaDeCadastro extends JPanel implements ActionListener{

	private JButton botaoDeCadastro;
	private Writer writer;
	private ArrayList<AreaDeDigitacao> areasDeDigitacao;
	
	
	public JanelaDeCadastro() {
		writer = new Writer();
		areasDeDigitacao = new ArrayList<AreaDeDigitacao>();
		setLayout(new GridLayout());
		
		AreaDeDigitacao nameArea = new AreaDeDigitacao(" Nome:");
		nameArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		areasDeDigitacao.add(nameArea);
		
		AreaDeDigitacao cpfArea = new AreaDeDigitacao(" CPF:");
		cpfArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		areasDeDigitacao.add(cpfArea);
		
		AreaDeDigitacao matriculaArea = new AreaDeDigitacao(" Matrícula:");
		matriculaArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		areasDeDigitacao.add(matriculaArea);


		AreaDeDigitacao vertenteArea = new AreaDeDigitacao(" Vertente:");
		vertenteArea.setMaximumSize(new Dimension(this.getWidth(), 30));
		areasDeDigitacao.add(vertenteArea);
		
		botaoDeCadastro = new JButton(" Cadastrar");
		botaoDeCadastro.addActionListener(this);
		
//		for (AreaDeDigitacao areaDeDigitacao : areasDeDigitacao) {
//			areaDeDigitacao.setPreferredSize(new Dimension(200, 30));
//		}
		
		
		setLayout(new GridLayout(5,1));
		this.add(nameArea);
		this.add(cpfArea);
		this.add(matriculaArea);
		this.add(vertenteArea);
		this.add(botaoDeCadastro);
		setVisible(false);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		for (AreaDeDigitacao areaDeDigitacao : areasDeDigitacao) {
			writer.writeData("arquivos/DadosDosClientes", areaDeDigitacao.getTextoEscrito());
		}
	}
}
