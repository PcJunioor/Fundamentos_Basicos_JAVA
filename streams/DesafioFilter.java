package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	/*
	 * 1 . Filtrar produtos com deconto > 30%
	 * 2 . Filtrar Produtos que tenham frete Grátis
	 * 3 . MAP para colocar nome do produto o preço e "SUPER PROMOÇÃO"
	 */
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caneta", 1.0, 0, 0.1);
		Produto p2 = new Produto("Lapis", 0.50, 0, 0.1);
		Produto p3 = new Produto("Borracha", 2.0, 0, 0.2);
		Produto p4 = new Produto("Notebook", 3265.60, 0, 0.35);
		Produto p5 = new Produto("Televisão", 5600.0, 50.0, 0.1);
		Produto p6 = new Produto("Som", 2500.0, 0, 0.32);
		Produto p7 = new Produto("Video Game", 5000.0, 0, 0.30);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		// CRIANDO OS FILTROS	
		Predicate<Produto> filtro1 = p -> p.desconto >= 0.3;
		Predicate<Produto> filtro2 = p -> p.frete == 0;
		// CRIANDO O MAP		
		Function<Produto, String> exibir = p -> "Super Promoção >>> " 
				+ p.nome + ": " 
				+ String.format("%.2f", p.preco * (1 - p.desconto));
		// CRIANDO STREAM E APLICANDO AS LÓGICAS				
		produtos.stream()
				.filter(filtro1)
				.filter(filtro2)
				.map(exibir)
				.forEach(System.out::println);
		
		
		
	}

}
