package br.com.programa.livraria.teste;

import java.util.Comparator;

import br.com.programa.livraria.produtos.Livro;

public class ComparadorPorNome implements Comparator<Livro> {

	@Override
	public int compare(Livro l1, Livro l2) {
		// TODO Auto-generated method stub
		return l1.getNome().compareTo(l2.getNome());
	}

}
