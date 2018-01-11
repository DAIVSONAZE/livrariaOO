package br.com.programa.livraria.teste;

import br.com.programa.livraria.Autor;
import br.com.programa.livraria.produtos.Ebook;
import br.com.programa.livraria.produtos.Livro;
import br.com.programa.livraria.produtos.LivroFisico;
import br.com.programa.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Livro livro = new Livro();
		livro.adicionarValor(60.2);
		
		System.out.println("Valor atual R$" + livro.retornaValor());
		
		if(livro.aplicaDescontoDe(0.1)){
			System.out.println("DEsconto nao pode ser superior a 30%");
			
		}else{
			
			System.out.println("Valor com desconto R$ " + livro.retornaValor());
		}
		
		*/
		
		Autor autor = new Autor();
		autor.setNomeDoAutor("Lula Molusco");
		
		
		//desconto dado a livrofisico
		Livro livrofi = new LivroFisico(autor);
		livrofi.setValor(60.50);
		
		
		if(!livrofi.aplicaDescontoDe(0.3)){
			System.out.println("Desconto do livroFisico nao pode ser maior que 30%");
			
		}else{
			
			System.out.println("Valor do livroFisico com desconto R$" + livrofi.getValor());
		}
		
		
		//desconto dado a ebook
		Ebook ebook = new Ebook(autor);
		ebook.setValor(30.50);
		
		if(!ebook.aplicaDescontoDe(0.1)){
			
			
			System.out.println("Desconto do EBOOK nao pode ser maior que 15%");
		}else{
			
			System.out.println("Valor do EBOOK com desconto R$" + ebook.getValor());
		}
		
		
		//Neste caso, como e um minilivro livro, ja tem um valor reduzido sem a necessidade
		//de desconto, entao so ira aparecer o primeiro sysout
		Livro minilivro = new MiniLivro(autor);
		minilivro.setValor(39.90);
		
		if(!minilivro.aplicaDescontoDe(0.3)){
			System.out.println("O desconto no MINILIVRO nao pode ser maior que 30%");
		}else{
			System.out.println("O valor do MINILIVRO com desconto R$ " + minilivro.getValor());
		}
		
		
	}

}
