package oo.composicao.desafio;

public class Produto {
	final String nome;
	final double preco;
	
	public Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;		
	}

	@Override
	public String toString() {
		return nome + ": R$ " + preco;
	}
	
	
	

}
