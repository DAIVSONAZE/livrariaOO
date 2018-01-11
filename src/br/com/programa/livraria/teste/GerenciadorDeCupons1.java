package br.com.programa.livraria.teste;

import java.util.Arrays;
import java.util.List;

public class GerenciadorDeCupons1 {
	
	private List<String> cupons;

	public GerenciadorDeCupons1() {
			
		this.cupons = Arrays.asList("CUP231","CUP254","CUP95","CUP1","CUP56",
				"CUP29","CUP847","CUP11","CUP84","CUP10");
	}
	
	public boolean validaCupons(String cupom){
		return this.cupons.contains(cupom);
	}
	

}
