package br.com.programa.livraria.produtos;



public interface Produto extends Comparable<Produto> {

	//public abstract double getValor();
	// Como todo metodo sem corpo de uma interface e abstrato, o uso do modificador abstact e opcional
	//Nao precisamos adicionar o modificador public, pois seus metodos tambem sao publicos por padrao
	//simplificando assim...
	 double getValor();
}
