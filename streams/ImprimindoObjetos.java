package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		// USANDO FOREACH
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		// USANDO ITERATOR
		Iterator<String> iteracao = aprovados.iterator();
		while(iteracao.hasNext()) {
			System.out.println(iteracao.next());
			
		}
		
		//USANDO STREAM (CONJUNTO DE DADOS)
		Stream<String> streamin = aprovados.stream();
		streamin.forEach(System.out::println);
		
	}
	
	

}
