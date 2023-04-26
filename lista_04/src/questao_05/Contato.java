package questao_05;

public class Contato {

	private int codigo;
	private String name;
	private String endereco;
	private String email;
	private int telNumber;
	private String obs;
	
	public Contato(int codigo) {
		if(codigo>=1000 && codigo<=9999) {
			this.codigo=codigo;
		}else {
			System.out.println("Codigo invalido, cadastre um codigo entre 1000 e 9999");
		}
	}
	
	public Contato(int codigo, String name) {
		this.name=name;
		if(codigo>=1000 && codigo<=9999) {
			this.codigo=codigo;
		}else {
			System.out.println("Codigo invalido, cadastre um codigo entre 1000 e 9999");
		}
	}
	
	public Contato(int codigo, String name, String email) {
		this.name=name;
		this.email=email;
		if(codigo>=1000 && codigo<=9999) {
			this.codigo=codigo;
		}else {
			System.out.println("Codigo invalido, cadastre um codigo entre 1000 e 9999");
		}
	}
	
	public Contato(int codigo, String name, String email, int telNumber) {
		this.name=name;
		this.email=email;
		if(telNumber>=10000000 && telNumber<=99999999) {
			this.telNumber=telNumber;
		}else {
			System.out.println("Telefone invalido, o telefone deve conter 8 digitos");
		}
		if(codigo>=1000 && codigo<=9999) {
			this.codigo=codigo;
		}else {
			System.out.println("Codigo invalido, cadastre um codigo entre 1000 e 9999");
		}
	}
	
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	public void setObs(String obs) {
		this.obs=obs;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setCodigo(int codigo) {
		if(codigo>=1000 && codigo<=9999) {
			this.codigo=codigo;
		}else {
			System.out.println("Codigo invalido, cadastre um codigo entre 1000 e 9999");
		}
	}
	
	public void setTelNumber(int telNumber) {
		if(telNumber>=10000000 && telNumber<=99999999) {
			this.telNumber=telNumber;
		}else {
			System.out.println("Telefone invalido, o telefone deve conter 8 digitos");
		}
	}
	
	public Contato duplicarContato() {
		Contato copia = this;
		return copia;
	}
	
	public void printDadosContato() {
		System.out.println("------------CONTATO------------");
		System.out.println(codigo);
		System.out.println(name);
		System.out.println(endereco);
		System.out.println(email);
		System.out.println(telNumber);
		System.out.println(obs);
	}

	public boolean verificarContatoPreenchido() {
		if(codigo==0||telNumber==0||name==null||endereco==null||email==null||obs==null) {
			return false;
		}
		return true;
	}
	
}
