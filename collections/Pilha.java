package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O rato");
		livros.push("Don quixote");
		livros.push("Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.poll()); //remove o ultimo
		System.out.println(livros.poll()); //remove o ultimo
	}

}
