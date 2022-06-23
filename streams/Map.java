package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		System.out.println(print);
		List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiuscula = x -> x.toUpperCase();
		UnaryOperator<String> primeiraLetra = x -> x.charAt(0) + "";
		UnaryOperator<String> grito = x -> x + "!!!";
		
		// USANDO COMPOSIÇÃO
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);
		
		// USANDO CLASSE	
		marcas.stream()
		.map(Utilitarios.maiuscula)
		.map(Utilitarios.primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);
		
		
		
	}

}
