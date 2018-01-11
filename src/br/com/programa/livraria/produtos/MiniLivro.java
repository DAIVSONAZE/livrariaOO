package br.com.programa.livraria.produtos;

import br.com.programa.livraria.Autor;

public class MiniLivro extends Livro {

	
	
	public MiniLivro(Autor autor){
		super(autor);
	}
	
	
	public boolean aplicaDescontoDe( double porcentagem){
		
		return false;
	}
}
