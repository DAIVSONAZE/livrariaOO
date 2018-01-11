package br.com.programa.livraria.teste;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GerenciadorDeCupons2 {

	
	private Set<String> cupons;

	public GerenciadorDeCupons2() {
		
		this.cupons = new HashSet<String>();
		
		
		cupons.addAll(Arrays.asList("CUP54","CUP12","CUP23","CUP14","CUP65","CUP34","CUP87",
				"CUP56","CUP82","CUP95"));
	}
	
	
	public boolean validaCupons(String cupom){
		//muito mais rapido!
		return this.cupons.contains(cupom);
	}
	
}
