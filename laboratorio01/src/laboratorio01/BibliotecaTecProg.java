package laboratorio01;

import java.util.ArrayList;

import cliente.*;
import publicacoes.*;

public class BibliotecaTecProg {

	public ArrayList<Emprestimo> listaEmprestimo;
	public ArrayList<Publicacoes> listaPublicacoes;
	public ArrayList<Cliente> listaCliente;

	public BibliotecaTecProg() {
		listaEmprestimo = new ArrayList<Emprestimo>();
		listaCliente = new ArrayList<Cliente>();
		listaPublicacoes = new ArrayList<Publicacoes>();
	}
	
	public void addEmprestimoToBiblioteca(Emprestimo emprestimo) {
		if(emprestimo.cliente!=null && emprestimo.publicacao!=null) {
			this.listaEmprestimo.add(emprestimo);
			
			if(!listaCliente.contains(emprestimo.cliente)) 
				listaCliente.add(emprestimo.cliente);
			
			if(!listaPublicacoes.contains(emprestimo.publicacao))
				listaPublicacoes.add(emprestimo.publicacao);
		}
	}
	
	public String relatorioDeEmprestimos() {
		int quantidadeTotalDeLivros=0, quantidadeTotalDeArtigos=0, quantidadeTotalDeTCCs=0, quantidadeTotalDeRevistas=0;;
		
		System.out.println("\nRelatorio de Emprestimos: ");
		
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.publicacao instanceof Livros) {
				quantidadeTotalDeLivros++;
			}else if(emprestimo.publicacao instanceof Artigo) {
				quantidadeTotalDeArtigos++;
			}else if(emprestimo.publicacao instanceof TCC) {
				quantidadeTotalDeTCCs++;
			}else if(emprestimo.publicacao instanceof Revistas) {
				quantidadeTotalDeRevistas++;
			}
		}
		
		String relatorioLivros = "Livros : " + quantidadeTotalDeLivros + "\nProfessor: ";
		
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Professor && emprestimo.publicacao instanceof Livros)
				relatorioLivros+=emprestimo.cliente.getNome() + " ";
		}
		relatorioLivros+="\nAluno: ";
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Aluno && emprestimo.publicacao instanceof Livros)
				relatorioLivros+=emprestimo.cliente.getNome() + " ";
		}
		relatorioLivros+="\nServidor: ";
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Servidor && emprestimo.publicacao instanceof Livros)
				relatorioLivros+=emprestimo.cliente.getNome() + " ";
		}
		
		
		
		String relatorioArtigos = "Artigos: " + quantidadeTotalDeArtigos + "\nProfessor: ";
		
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Professor && emprestimo.publicacao instanceof Artigo)
				relatorioArtigos+=emprestimo.cliente.getNome() + " ";
		}
		relatorioArtigos+="\nAluno: ";
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Aluno && emprestimo.publicacao instanceof Artigo)
				relatorioArtigos+=emprestimo.cliente.getNome() + " ";
		}
		relatorioArtigos+="\nServidor: ";
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Servidor && emprestimo.publicacao instanceof Artigo)
				relatorioArtigos+=emprestimo.cliente.getNome() + " ";
		}

		
		
		String relatorioRevistas = "Revistas: " + quantidadeTotalDeRevistas + "\nProfessor: ";
		
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Professor && emprestimo.publicacao instanceof Revistas)
				relatorioRevistas+=emprestimo.cliente.getNome() + " ";
		}
		relatorioRevistas+="\nAluno: ";
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Aluno && emprestimo.publicacao instanceof Revistas)
				relatorioRevistas+=emprestimo.cliente.getNome() + " ";
		}
		relatorioRevistas+="\nServidor: ";
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Servidor && emprestimo.publicacao instanceof Revistas)
				relatorioRevistas+=emprestimo.cliente.getNome() + " ";
		}
		

		
		
		String relatorioTCC = "TCCs: " + quantidadeTotalDeTCCs + "\nProfessor: ";
		
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Professor && emprestimo.publicacao instanceof TCC)
				relatorioTCC+=emprestimo.cliente.getNome() + " ";
		}
		relatorioTCC+="\nAluno: ";
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Aluno && emprestimo.publicacao instanceof TCC)
				relatorioTCC+=emprestimo.cliente.getNome() + " ";
		}
		relatorioTCC+="\nServidor: ";
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente instanceof Servidor && emprestimo.publicacao instanceof TCC)
				relatorioTCC+=emprestimo.cliente.getNome() + " ";
		}
		
		return relatorioLivros + "\n\n" + relatorioArtigos + "\n\n" + relatorioRevistas + "\n\n" + relatorioTCC;
	}
	
	public String relatorioDeClientes() {
		String relatorioDeClientes = "Relatorio de Clientes:\nProfessores: \n";
		for (Cliente cliente : listaCliente) {
			if(cliente instanceof Professor)
				relatorioDeClientes+=cliente.getNome() +", " + cliente.getMatricula() + ", " + cliente.getTPs() + "\n";
		}
		
		relatorioDeClientes+="\nAlunos: \n";
		for (Cliente cliente : listaCliente) {
			if(cliente instanceof Aluno)
				relatorioDeClientes+=cliente.getNome() +", " + cliente.getMatricula() + ", " + cliente.getTPs() + "\n";
		}
		
		relatorioDeClientes+="\nServidores: \n";
		for (Cliente cliente : listaCliente) {
			if(cliente instanceof Servidor)
				relatorioDeClientes+=cliente.getNome() +", " + cliente.getMatricula() + ", " + cliente.getTPs() + "\n";
		}
		
		return relatorioDeClientes;
	}
	
	public String relatorioDePublicacoes() {
		String relatorioDePublicacoes = "Relatorio de Publicacoes:\nLivros:\n";
		for (Publicacoes publicacao : listaPublicacoes) {
			if(publicacao instanceof Livros) {
				relatorioDePublicacoes+=publicacao.getTitulo() + ", " + publicacao.getAnoDePublicacao() + ", " + publicacao.getAutor() + ", " + publicacao.getQuantidadeDisponivel() + "\n";
			}
		}
		relatorioDePublicacoes+="\nArtigos:\n";
		for (Publicacoes publicacao : listaPublicacoes) {
			if(publicacao instanceof Artigo) {
				relatorioDePublicacoes+=publicacao.getTitulo() + ", " + publicacao.getAnoDePublicacao() + ", " + publicacao.getAutor() + ", " + publicacao.getQuantidadeDisponivel() + "\n";
			}
		}
		relatorioDePublicacoes+="\nRevistas:\n";
		for (Publicacoes publicacao : listaPublicacoes) {
			if(publicacao instanceof Revistas) {
				relatorioDePublicacoes+=publicacao.getTitulo() + ", " + publicacao.getAnoDePublicacao() + ", " + publicacao.getAutor() + ", " + publicacao.getQuantidadeDisponivel() + "\n";
			}
		}
		relatorioDePublicacoes+="\nTCC:\n";
		for (Publicacoes publicacao : listaPublicacoes) {
			if(publicacao instanceof TCC) {
				relatorioDePublicacoes+=publicacao.getTitulo() + ", " + publicacao.getAnoDePublicacao() + ", " + publicacao.getAutor() + ", " + publicacao.getQuantidadeDisponivel() + "\n";
			}
		}
		
		return relatorioDePublicacoes;
	}
	
	public String consultarEmprestimosPelaMatricula(int matricula) {
		String relatorioDaMatricula = "A matricula: " + matricula + " pertence ao cliente: ";
		for (Cliente cliente : listaCliente) {
			if(cliente.getMatricula()==matricula) {
				relatorioDaMatricula+=cliente.getNome();
			}
		}
		relatorioDaMatricula+="\nOs Titulos emprestados a ele foram:\n";
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente.getMatricula()==matricula) {
				relatorioDaMatricula+=emprestimo.publicacao.getTitulo() + "\n";
			}
		}
		
		return relatorioDaMatricula;
	}
}