package br.com.programa.livraria;

public class Autor {
	
	private String nomeDoAutor;
	private String emailDoAutor;
	private String cpfDoAutor;
	
	
	
	
	public String getNomeDoAutor() {
		return nomeDoAutor;
	}




	public void setNomeDoAutor(String nomeDoAutor) {
		this.nomeDoAutor = nomeDoAutor;
	}




	public String getEmailDoAutor() {
		return emailDoAutor;
	}




	public void setEmailDoAutor(String emailDoAutor) {
		this.emailDoAutor = emailDoAutor;
	}




	public String getCpfDoAutor() {
		return cpfDoAutor;
	}




	public void setCpfDoAutor(String cpfDoAutor) {
		this.cpfDoAutor = cpfDoAutor;
	}




	public void mostrarDetalhesAutor(){
		
		String mensagem = " Mostrando detalhes do AUTOR:";
		System.out.println(mensagem);
		System.out.println(this.nomeDoAutor);	
		System.out.println(this.emailDoAutor);
		System.out.println(this.cpfDoAutor);
		
		
		
	}
	
	
}
