package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		// CRIANDO O METHOD REFERENCE
		Consumer<String> print =  System.out::println;
		Consumer<Integer> print2 = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "LUA", "Js\n");
		langs.forEach(print);		
		// USANDO ARRAYS
		String[] maisLangs = {"Python", "Lisp" , "Pearl", "Go\n"};
		Stream.of(maisLangs).forEach(print);
		// USANDO ARRAYS
		Arrays.stream(maisLangs).forEach(print);		
		// SELECIONA ELEMENTOS PARA EXIBIR
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		// USANDO LIST	
		List<String> outrasLangs = Arrays.asList("\npHp", "C++", "C#\n");
		outrasLangs.stream().forEach(print);
		// PARALLEL STREAM NÃO EXECUTA NA MESMA ORDEM
		outrasLangs.parallelStream().forEach(print);
		// STREAM INFINITA
		Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(print2);
		
		
		
	}

}
