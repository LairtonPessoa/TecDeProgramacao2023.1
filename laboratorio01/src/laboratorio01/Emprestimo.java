package laboratorio01;

import cliente.Cliente;
import publicacoes.Artigo;
import publicacoes.Livros;
import publicacoes.Publicacoes;
import publicacoes.Revistas;

public class Emprestimo {

	public Cliente cliente;
	public Publicacoes publicacao;
	
	public Emprestimo(Cliente cliente, Publicacoes publicacao) {
		if(cliente.getNumeroDeEmprestimosDisponiveis()>0&&publicacao.getQuantidadeDisponivel()>0) {
			this.cliente=cliente;
			this.publicacao=publicacao;
			
			if(publicacao instanceof Livros)
				this.cliente.setTPs(this.cliente.getTPs()-(float)(this.cliente.gastoDeTP()-this.cliente.darDesconto()*this.cliente.gastoDeTP()*0.1));
			if(publicacao instanceof Revistas)
				this.cliente.setTPs(this.cliente.getTPs()-(float)(this.cliente.gastoDeTP()-this.cliente.darDesconto()*this.cliente.gastoDeTP()*0.01));
			if(publicacao instanceof Artigo)
				this.cliente.setTPs(this.cliente.getTPs()-(float)(this.cliente.gastoDeTP()-this.cliente.darDesconto()*this.cliente.gastoDeTP()*0.5));
			else
				this.cliente.setTPs(this.cliente.getTPs()-this.cliente.gastoDeTP());
			
			if(this.cliente.getTPs()%50==0) {
				System.out.println("O " + this.cliente.getTipo() + " " + this.cliente.getNome() + " deve fazer uma doacao");
			}
			
			this.cliente.setNumeroDeEmprestimosDisponiveis(this.cliente.getNumeroDeEmprestimosDisponiveis()-1);
			
			this.publicacao.setQuantidadeDisponivel(this.publicacao.getQuantidadeDisponivel()-1);
			this.publicacao.setQuantidadeEmprestada(this.publicacao.getQuantidadeEmprestada()+1);
			
		}else if(this.cliente.getNumeroDeEmprestimosDisponiveis()<=0){
			System.out.println("O " + this.cliente.getTipo() + ": " + this.cliente.getNome() + " atingiu o maximo de emprestimos");
		}else if(this.publicacao.getQuantidadeDisponivel()<=0) {
			System.out.println("A quantidade deste exemplar se esgotou");
		}
	}
	
	public String getDadosEmprestimo() {
		return cliente.getTipo() + ": " + cliente.getNome() + "\n" + publicacao.getTipo() + ": "
				+ publicacao.getTitulo() + "\nDias emprestados: " + cliente.verificarDias(); 
	}

}
