package questao_05;

public class Contato {

	private int codigo;
	private String name;
	private String endereco;
	private String email;
	private int telNumber;
	private String obs;
	
	public Contato(int codigo) {
		this.codigo=codigo;
	}
	
	public Contato(int codigo, String name) {
		this.codigo=codigo;
		this.name=name;
	}
	
	public Contato(int codigo, String name, String email) {
		this.codigo=codigo;
		this.name=name;
		this.email=email;
	}
	
	public Contato(int codigo, String name, String email, int telNumber) {
		this.codigo=codigo;
		this.name=name;
		this.email=email;
		this.telNumber=telNumber;
	}
}
