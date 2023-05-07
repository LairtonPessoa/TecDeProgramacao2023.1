package laboratorio01;

import cliente.*;
import publicacoes.*;

public class Main {

	public static void main(String[] args) {

		BibliotecaTecProg Bib = new BibliotecaTecProg();
		
		Aluno aluno1 = new Aluno(539179, "Lairton");
		Aluno aluno2 = new Aluno(541247, "Antonio");
		
		Professor professor1 = new Professor(125469, "Fischer");
		Professor professor2 = new Professor(254871, "Rui");
		
		Servidor servidor1 = new Servidor(457812, "Jose");
		Servidor servidor2 = new Servidor(547821, "Luana");

		Livros livro1 = new Livros("Java como programa", 2020, "Deitel", 10);
		Livros livro2 = new Livros("Python como programa", 2019, "Oliveira", 10);
		
		Revistas revista1 = new Revistas("INDICO: inclusao digital necessaria para sociedade atual", 2023, "Geovana e Cau�", 8);
		Revistas revista2 = new Revistas("inteligencia artificial aplicada", 2023, "Amora",10);

		Artigo artigo1 = new Artigo("Um comparativo de desempenho entre Java e Python", 2021, "Silva", 4);
		Artigo artigo2 = new Artigo("Um comparativo entre o Eclipse e VsCode", 2023, "Cordeiro", 5);
		
		Emprestimo e1 = new Emprestimo(aluno1, livro1);
		Emprestimo e2 = new Emprestimo(aluno1, livro2);
		Emprestimo e3 = new Emprestimo(aluno1, artigo1);
		
		Emprestimo e4= new Emprestimo(aluno2, livro1);
		Emprestimo e5= new Emprestimo(aluno2, livro2);
		Emprestimo e6= new Emprestimo(aluno2, revista2);
		Emprestimo e7= new Emprestimo(aluno2, artigo2);
		
		Emprestimo e8= new Emprestimo(professor1, artigo1);
		Emprestimo e9= new Emprestimo(professor1, artigo2);
		
		Emprestimo e10= new Emprestimo(professor2, artigo1);
		Emprestimo e11= new Emprestimo(professor2, artigo2);
		Emprestimo e12= new Emprestimo(professor2, revista1);
		
		Emprestimo e13= new Emprestimo(servidor1, revista2);
		Emprestimo e14= new Emprestimo(servidor1, livro2);
		
		Emprestimo e15= new Emprestimo(servidor2, revista1);
		Emprestimo e16= new Emprestimo(servidor2, revista2);
		
		Bib.addEmprestimoToBiblioteca(e1);
		Bib.addEmprestimoToBiblioteca(e2);
		Bib.addEmprestimoToBiblioteca(e3);
		Bib.addEmprestimoToBiblioteca(e4);
		Bib.addEmprestimoToBiblioteca(e5);
		Bib.addEmprestimoToBiblioteca(e6);
		Bib.addEmprestimoToBiblioteca(e7);
		Bib.addEmprestimoToBiblioteca(e8);
		Bib.addEmprestimoToBiblioteca(e9);
		Bib.addEmprestimoToBiblioteca(e10);
		Bib.addEmprestimoToBiblioteca(e11);
		Bib.addEmprestimoToBiblioteca(e12);
		Bib.addEmprestimoToBiblioteca(e13);
		Bib.addEmprestimoToBiblioteca(e14);
		Bib.addEmprestimoToBiblioteca(e15);
		Bib.addEmprestimoToBiblioteca(e16);
		
		System.out.println(Bib.relatorioDeEmprestimos());
		System.out.println();
		System.out.println(Bib.relatorioDeClientes());

	}

}
