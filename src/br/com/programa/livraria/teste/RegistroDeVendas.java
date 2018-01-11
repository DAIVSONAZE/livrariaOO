package br.com.programa.livraria.teste;

import java.util.List;

import br.com.programa.livraria.Autor;
import br.com.programa.livraria.produtos.CarrinhoDeCompras;
import br.com.programa.livraria.produtos.Ebook;
import br.com.programa.livraria.produtos.LivroFisico;
import br.com.programa.livraria.produtos.Produto;


public class RegistroDeVendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor autor = new Autor();
		autor.setNomeDoAutor("Marurici Maniere");
		
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-drive fisico");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-drive ebook");
		ebook.setValor(29.90);
		
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		if(fisico.aplicaDescontoDe10Porcento()){
			System.out.println("O valor do LIVROFISICO agora e " + fisico.getValor());
		}
		
		
		
		//carrinho.adiciona(livro);
		
		System.out.println("Total " + carrinho.getTotal());
		
		
		List<Produto> produtos = carrinho.getProdutos();
		
		for(Produto produto : produtos){ //Isso significa que o enhanced-for 
										//também funciona com qualquer tipo de List
			
			System.out.println(produto);
			
			
		}
		
	
		

	}

}
