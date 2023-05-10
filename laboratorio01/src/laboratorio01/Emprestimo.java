package laboratorio01;

import cliente.*;
import publicacoes.*;

public class Emprestimo {

	public Cliente cliente;
	public Publicacoes publicacao;
	
	public Emprestimo(Cliente cliente, Publicacoes publicacao) {
		if(cliente.getNumeroDeEmprestimosDisponiveis()>0&&publicacao.getQuantidadeDisponivel()>0) {
			this.cliente=cliente;
			this.publicacao=publicacao;
			
			cliente.setTPs(cliente.getTPs()-(cliente.gastoDeTP()-cliente.temDesconto()*cliente.gastoDeTP()*publicacao.porcentagemDeDesconto()));
			
			if(cliente.getTPs()%50==0) {
				System.out.println("O " + cliente.getTipo() + " " + cliente.getNome() + " deve fazer uma doacao");
			}
			
			cliente.setNumeroDeEmprestimosDisponiveis(cliente.getNumeroDeEmprestimosDisponiveis()-1);
			publicacao.setQuantidadeDisponivel(publicacao.getQuantidadeDisponivel()-1);
			publicacao.setQuantidadeEmprestada(publicacao.getQuantidadeEmprestada()+1);
			
		}if(cliente.getNumeroDeEmprestimosDisponiveis()<=0){
			System.out.println("O " + cliente.getTipo() + ": " + cliente.getNome() + " atingiu o maximo de emprestimos");
		}if(publicacao.getQuantidadeDisponivel()<=0) {
			System.out.println("A quantidade deste exemplar se esgotou");
		}
	}
	
	public String getDadosEmprestimo() {
		return cliente.getTipo() + ": " + cliente.getNome() + "\n" + publicacao.getTipo() + ": "
				+ publicacao.getTitulo() + "\nDias emprestados: " + cliente.verificarDias(); 
	}

}
