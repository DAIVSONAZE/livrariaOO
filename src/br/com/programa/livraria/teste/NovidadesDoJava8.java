package br.com.programa.livraria.teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.programa.livraria.Autor;
import br.com.programa.livraria.produtos.Livro;
import br.com.programa.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Autor autor = new Autor();
		autor.setCpfDoAutor(" Tiririca do Ceara");
		
		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("JAVA OO");
		
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("JAVA8");
		
		
		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de RUBY");
			
			
			
		
		
		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
		
		Collections.sort(livros, new ComparadorPorNome());
		
		
		for(Livro livro : livros){
			System.out.println(livro.getNome());
		}

	}

}
