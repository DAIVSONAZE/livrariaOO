package br.com.programa.livraria.produtos;

import br.com.programa.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {

	public LivroFisico(Autor autor) {
		super(autor);
		
		}
	
	
	
	public double getTaxaImpressao(){
		
		
		return this.getValor() * 0.05;
	
	
	}
	
	
	public boolean aplicaDescontoDe( double porcentagem){
		
		if(porcentagem > 0.3){
			return false;
			
		}else{
			
			double desconto = getValor() * porcentagem;
			
			setValor(getValor() - desconto);
			System.out.println("Aplicando desconto no livroFisico");
			
			return true;
		}
	}
}
