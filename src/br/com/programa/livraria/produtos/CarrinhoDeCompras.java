package br.com.programa.livraria.produtos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras  {

	
	private double total;
	private List<Produto> produtos; //diamond operator
	
	
	public CarrinhoDeCompras() { // construtor
		
		this.produtos = new ArrayList<>();//diamond operator
	}
	
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	
	

	public double getTotal() {
		return total;
	}
	
	

	public void adiciona(Livro livro){
		System.out.println("Adicionando " + livro);
		
		livro.aplicaDescontoDe(0.16);
		
		 total += livro.getValor();
		
	}
	

	
	
	public void adiciona(Revista revista){
		System.out.println("Adiciona " + revista);
		revista.aplicaDescontoDe(0.05);
		
		total += revista.getValor();
	}
	
	
	public void adicionar(Produto produto){
		
		this.produtos.add(produto);
		
	}

	
	
	public void remover( int posicao){
		
		this.produtos.remove(posicao);
	}
	
	
	
	
//public void adiciona(LivroFisico livrofisico){
	
	
//	System.out.println("Adiciona: " + livrofisico);
//}

public void adiciona(Ebook ebook){
	
	
	System.out.println("Adiciona: " + ebook.toString()); //com ou se toString() compilou 
														// com mesmo resultado
}

	
	

}
