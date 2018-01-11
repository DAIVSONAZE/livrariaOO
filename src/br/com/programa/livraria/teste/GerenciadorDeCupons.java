package br.com.programa.livraria.teste;


import java.util.HashMap;

import java.util.Map;


public class GerenciadorDeCupons {
	
	private Map<String, Double> cupons;

	public GerenciadorDeCupons() {
		
		this.cupons = new HashMap<>();
		
		cupons.put("CUP11", 10.00);
		cupons.put("CUP22", 20.00);
		cupons.put("CUP33", 30.00);
		cupons.put("CUP44", 40.00);
		cupons.put("CUP55", 50.00);
	}
	
	
	public Double validaCupons(String cupom){
		return this.cupons.get(cupom);
		
	}
	
	

}
