package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println("\nProduto: " + p.nome);
		
		Produto p1 = new Produto("Caneta", 0.34, 0.09);
		//imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 3899.54, 0.15);
		Produto p3 = new Produto("Lapis", 0.59, 0.09);
		Produto p4 = new Produto("Borracha", 0.20, 0.09);
		Produto p5 = new Produto("Apontador", 0.10, 0.09);
		
		List<Produto> produtos =  Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimir);
		
		produtos.forEach(System.out::println);
		
		
	}

}
