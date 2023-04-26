package questao_05;

public class Main {

	public static void main(String[] args) {
		/*5) Um contato é constituído de código, nome da pessoa, endereço, e-mail,
		telefone e observação.
		a. Crie 4 construtores e atribua o valores por meio dos construtores. Os
		construtores devem receber os seguintes parâmetros:
		I. Código.
		II. Código e nome.
		III. Código, nome e e-mail.
		IV. Telefone.
		b. O atributo e-mail não poderá ser modificado fora da classe contato, mas
		poderá ser acessado por outras classes.
		c. Faça um método para imprimir o código, nome, endereço, e-mail, telefone
		e observação dos contatos cadastrados.
		d. Faça um validador do código do contato. Um código válido é maior
		igual a 1000 e menor igual a 9999. Não permita que seja cadastrado
		um código inválido para nenhum contato.
		e. Faça um validador para o telefone. O telefone sempre deverá ter 8 dígitos.
		Não permita que seja cadastrado um telefone inválido para nenhum contato.
		f. Crie um método que possa duplicar um contato. Desta forma, um novo
		contato terá os mesmos dados do contato que for requerido a duplicação.
		g. Faça um método para verificar se o contato está totalmente preenchido.
		Ou seja, tenha valores diferentes do padrão para: código, nome, endereço, e-mail,
		telefone e observação.
		h. Crie uma classe agenda que é composta de uma lista de contatos, nome
		da agenda e uma descrição.
		i. Crie uma classe cliente que poderá usar uma agenda.
		j. Faça uma classe main para testar seu sistema criado.*/
		System.out.println("Questao 05");
		
		Contato fulano = new Contato(1000, "Fulano", "fulano@alu.ufc.br", 94548751);
		Contato ciclano = new Contato(1500, "Ciclano", "ciclano@alu.ufc.br", 48754869);
		Contato beltrano = new Contato(1427, "Beltrano", "beltrano@alu.ufc.br",25483620);
		
		System.out.println(fulano.getEmail());
		System.out.println(ciclano.getEmail());
		System.out.println(beltrano.getEmail());
		
		fulano.setEndereco("Rua Dr.Josias Nº 36");
		ciclano.setEndereco("Rua Sebastião Miranda Nº 571");
		beltrano.setEndereco("Rua Monsenhor Candido Nº 827");
		
		fulano.printDadosContato();
		if(fulano.verificarContatoPreenchido()==false)
			System.out.println("Algum dado esta faltando");
		else
			System.out.println("Todos os dados preenchidos");
		
	    fulano.setObs("Nao sei");
	    ciclano.setObs("sei nao");
	    beltrano.setObs("nem conheco");
	    
	    fulano.printDadosContato();
	    if(fulano.verificarContatoPreenchido()==false)
			System.out.println("Algum dado esta faltando");
		else
			System.out.println("Todos os dados preenchidos");
		
		Agenda minhaAgenda = new Agenda("Agenda de Lairton", "Minha Agenda");
		minhaAgenda.addCttToAgenda(fulano);
		minhaAgenda.addCttToAgenda(ciclano);
		minhaAgenda.addCttToAgenda(beltrano);

		Cliente c = new Cliente(minhaAgenda);
		
		System.out.println("\n*********************AGENDA*********************");
		System.out.println(c.agenda.name);
		System.out.println(c.agenda.descricao);
		for (int i = 0; i < minhaAgenda.listaDeContatos.size(); i++) {
			c.agenda.listaDeContatos.get(i).printDadosContato();
			
		}
		
		
	}

}
