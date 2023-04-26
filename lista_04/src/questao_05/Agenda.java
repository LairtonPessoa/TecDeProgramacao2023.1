package questao_05;

import java.util.ArrayList;

public class Agenda {

	protected ArrayList<Contato> listaDeContatos;
	protected String name;
	protected String descricao;
	
	public Agenda(String name, String descricao) {
		this.name=name;
		this.descricao=descricao;	
		listaDeContatos = new ArrayList<Contato>();
	}
	
	public void addCttToAgenda(Contato contato) {
		listaDeContatos.add(contato);
	}

}
