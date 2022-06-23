package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		 
		 Compra compra1 = new Compra();
		 // 2 FORMAS DE ADICIONAR ITEM 
		 compra1.adicionarItem("Caneta", 1, 5);
		// 2 FORMAS DE ADICIONAR O ITEM
		 compra1.adicionarItem(new Produto("Lapis",1), 3);
		 
		 Compra compra2 = new Compra();
		 // 2 FORMAS DE ADICIONAR ITEM 
		 compra2.adicionarItem("Caderno", 1, 5);
		 // 2 FORMAS DE ADICIONAR O ITEM
		 compra2.adicionarItem(new Produto("borracha", 2), 5);
		 
		 Cliente cliente = new Cliente("Paulo Cesar");
		 cliente.adicionarCompra(compra2);
		 cliente.adicionarCompra(compra1);
		 
		
		 cliente.exibirCompra();
	
	}

}
