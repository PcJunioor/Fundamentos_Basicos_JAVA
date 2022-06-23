package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<Item>();
	
	// 2 FORMAS DE ADICIONAR O ITEM
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));		
	}
	// 2 FORMAS DE ADICIONAR O ITEM
	void adicionarItem(String nome, double preco,  int qtde) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));		
	}
	
	double getValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.qtde * item.produto.preco;
		}
		
		return total;
	}
	@Override
	public String toString() {
		return "\n" + itens + "\n";
	}
	
	

}
