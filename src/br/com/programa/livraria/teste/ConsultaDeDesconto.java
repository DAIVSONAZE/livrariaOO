package br.com.programa.livraria.teste;

public class ConsultaDeDesconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		Double desconto = gerenciador.validaCupons("CUP22");
		
		if(desconto != null){
			System.out.println("Cupom de desconto valido!");
			System.out.println("Valor de " + desconto);
		}else{
			System.out.println("Esse cupom nao existe");
		}

		
		//----------------------------------------------
		
GerenciadorDeCupons1 gerenciador1 = new GerenciadorDeCupons1();
		
		if(gerenciador1.validaCupons("CUP231")){
			System.out.println("Cupom TIPO 1 de desconto valido!");
		}else{
			System.out.println("Esse cupom TIPO 1 nao existe");
		}
		
		
		
		//----------------------------------------------
		GerenciadorDeCupons2 gerenciador2 = new GerenciadorDeCupons2();
		
		if(gerenciador2.validaCupons("CUP54")){
			System.out.println("Cupom TIPO 2 de desconto valido!");
		}else{
			System.out.println("Esse cupom TIPO 2 nao existe");
		}

	}
	
	
}
