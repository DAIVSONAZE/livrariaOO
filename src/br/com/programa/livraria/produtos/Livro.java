package br.com.programa.livraria.produtos;

import br.com.programa.livraria.Autor;

public abstract class Livro implements Produto {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro( Autor autor){
		this.autor = autor;
	}
	
	public Livro(){
		
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void mostrarDetalhesLivro(){
		
		String mensagem = " Mostrando detalhes do livro:";
		System.out.println(mensagem);
		System.out.println("Nome :" + this.nome);
		System.out.println("Descrição :" + this.descricao);
		System.out.println("Valor :" + this.valor);
		System.out.println(" ISBN :" + this.isbn);
		
		
		if(this.temAutor()){
			
			autor.mostrarDetalhesAutor();
		}
		
		System.out.println("--");

	}
	
		boolean temAutor(){
		//boolean naoEhNull = this.autor != null;
		//return naoEhNull
			
			
		return this.autor != null; // forma mais simples
	}

	
	public abstract boolean aplicaDescontoDe( double porcentagem);
		//if(porcentagem > 0.3){
			//return false;
			
		//}
		
	
		//this.valor -= this.valor * porcentagem;
		//return true;
	//}
	
		void adicionarValor(double valor){
			this.valor = valor;
		}
		
		double retornaValor(){
			return this.valor;
		}
	
		
		@Override
		public int compareTo(Produto outro){
			if(this.getValor() < outro.getValor()){
				
				return -1;
			}
			
			if(this.getValor() > outro.getValor()){
				return 1;
			}
			return 0;
		}
}
