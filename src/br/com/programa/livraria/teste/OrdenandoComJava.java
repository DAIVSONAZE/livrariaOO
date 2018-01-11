package br.com.programa.livraria.teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



import br.com.programa.livraria.Autor;
import br.com.programa.livraria.produtos.Ebook;
import br.com.programa.livraria.produtos.LivroFisico;
import br.com.programa.livraria.produtos.Produto;


public class OrdenandoComJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Autor autor = new Autor();
		autor.setNomeDoAutor("Luiz Caudas");
		
		
		LivroFisico livro1 = new LivroFisico(autor);
		livro1.setValor(40.00);
		
		
		Ebook ebook1 = new Ebook(autor);
		ebook1.setValor(20.00);
		
		List<Produto> produtos = Arrays.asList(livro1, ebook1);
		
		Collections.sort(produtos);
		
		
		//enhanced-for
		//for(Produto produto : produtos){
		//	System.out.println(produto.getValor());
		//}
		
		//forEach dojava 8
		produtos.forEach(l-> System.out.println(l.getValor()));
		
	}

}
