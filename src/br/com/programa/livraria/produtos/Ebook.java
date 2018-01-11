package br.com.programa.livraria.produtos;

import br.com.programa.livraria.Autor;

public class Ebook extends Livro implements Promocional {
	
	
	private String waterMark;
	


	public Ebook(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	
	@Override
	public boolean aplicaDescontoDe( double porcentagem){
		
		if(porcentagem > 0.15){
			
			return false;
		}
		
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		
		return true;
		
	}
	
	@Override
	public String toString(){
		return "Eu sou um EBOOK!";
	}

}
