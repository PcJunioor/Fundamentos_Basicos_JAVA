package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// offer e add adicionam elementos na fila
		// diferença é o comportamento quando a fila está cheia
		fila.add("Ana"); //joga uma exceção quando ta cheio
		fila.offer("Bia"); //joga false
		fila.offer("Rafael");
		fila.offer("Lucas");
		fila.offer("Joao");
		fila.offer("Bia");
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		
	}

}
