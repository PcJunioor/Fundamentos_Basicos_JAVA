package oo.composicao.desafio;

public class Item {
	
	final Produto produto;
	final int qtde;
	
	public Item(Produto produto, int qtde){
		this.produto = produto;
		this.qtde = qtde;
	}

	@Override
	public String toString() {
		return produto + " > Quantidade: " + qtde;
	}
	

}
