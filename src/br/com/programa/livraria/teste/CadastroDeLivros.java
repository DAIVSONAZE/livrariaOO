package br.com.programa.livraria.teste;

import br.com.programa.livraria.Autor;
import br.com.programa.livraria.produtos.Ebook;
import br.com.programa.livraria.produtos.Livro;
import br.com.programa.livraria.produtos.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Autor atr = new Autor();
		atr.setNomeDoAutor("Carlos henrique");;
		atr.setEmailDoAutor("carloshenr@pop.com");;
		atr.setCpfDoAutor("1236984578");
		
		
		/*
		Livro livro = new Livro(atr);
		livro.setNome("JAva");
		livro.setDescricao("Novos recursos");
		livro.setValor(59.90);
		livro.setIsbn("556-512-2-32");;
		
		livro.setAutor(atr); 
		*/
		
		
		Autor outroatr = new Autor();
		outroatr.setNomeDoAutor(" Beta Caroteno"); ;
		outroatr.setEmailDoAutor("Betacaroteno@vava.com");;
		outroatr.setCpfDoAutor("25689714569");;
		
		/*
		Livro livrosegundo = new Livro(outroatr);
		livrosegundo.setNome("C++");;
		livrosegundo.setDescricao("Implementacao");;
		livrosegundo.setValor(62.30);;
		livrosegundo.setIsbn("126-365-7-89");;
		
	
		livrosegundo.setAutor(outroatr);
		*/
		
		//livro.mostrarDetalhesLivro();
		//livrosegundo.mostrarDetalhesLivro();
		
		atr.mostrarDetalhesAutor();
		outroatr.mostrarDetalhesAutor();
		
		//livro.getAutor().mostrarDetalhesAutor();
		//livrosegundo.getAutor().mostrarDetalhesAutor();
		
		Livro livro = new LivroFisico(atr);
		livro.setNome("Java Para Iniciantes");
		livro.setDescricao("Implementando o codigo");
		livro.setValor(58.20);
		livro.setIsbn("526-45-87965-22-4");
		
		livro.setAutor(atr);
		
		
		Livro livroE = new Ebook(outroatr);
		livroE.setNome("C++ para Iniciantes");
		livroE.setDescricao("Metodos em C++");
		livroE.setValor(60.50);
		livroE.setIsbn("102-30-12546-10-7");
		
		livroE.setAutor(outroatr);
		

	}

}
