package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class DesafioMap {
	public static void main(String[] args) {
		
		
		/*
		 * 1. Número p/ string binário... 6 = 110
		 * 2. Inverter a String 110 -> 011
		 * 3. Converter de volta para inteiro 011 = 3
		 */
		Consumer<String> print = System.out::println;
		Consumer<Integer> printInt = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Function<Integer, String> paraBinario = num -> Integer.toBinaryString(num);
		Function<String, String> inverterString = str -> new StringBuilder(str)
				.reverse().toString();
		Function<String, Integer> strToBinario = num -> Integer.parseInt(num, 2);
		
		System.out.println("Para Binário");
		nums.stream().map(paraBinario).forEach(print);
		
		System.out.println("\nInverter String");
		nums.stream().map(paraBinario)
		.map(inverterString)
		.forEach(print);
		
		System.out.println("\nString para Binário");
		nums.stream().map(paraBinario)
		.map(strToBinario)
		.forEach(printInt);
	
		
	}

}
