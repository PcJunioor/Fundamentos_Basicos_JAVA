package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		compra1.cliente = "Paulo";
		compra2.cliente = "Pedro";
		
		
		
		//RELAÇÃO BIDIRECIONAL
		compra1.adicionarItem(new Item("Caneta", 20, 1));
		compra1.adicionarItem(new Item("Borracha", 10, 1));
		compra1.adicionarItem(new Item("Caneta", 15, 1));
		
		//RELAÇÃO UNIDIRECIONAL
		compra2.itens.add(new Item("Caneta", 20, 1));
		compra2.itens.add(new Item("Borracha", 10, 1));
		compra2.itens.add(new Item("Lapis", 15, 1));
		compra2.itens.add(new Item("Lapis", 15, 1));
		
		
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
		System.out.println(compra2.itens.size());
		System.out.println(compra2.getValorTotal());
		
		
	}

}
