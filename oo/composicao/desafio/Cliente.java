package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	final List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;		
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
		
	}
	
	
	
	void exibirCompra() {
		System.out.println("Cliente: " + nome);
		for (int i = 0; i < compras.size(); i++) {
			int indice = i + 1;
			System.out.println("Compra " + indice + ": " + compras.get(i));
		}
		System.out.println("Total da compra: R$" + this.getValorTotal());
		
	}
	
	double getValorTotal() {
		double total = 0;
		for(Compra compra: compras) {
			total += compra.getValorTotal();
		}
		
		return total;
	}

}
