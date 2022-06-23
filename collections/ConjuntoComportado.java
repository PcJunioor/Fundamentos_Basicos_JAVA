package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		
		//Set<String> lista = new HashSet<>(); //CRIA UM CONJUNTO DO TIPO STRING
		
		SortedSet<String> lista = new TreeSet<>(); // TREESET Cria com ordenação alfabetica
		
		lista.add("Paulo");
		lista.add("Carlos");
		lista.add("Lucas");
		lista.add("Pedro");

		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		for(int n: nums) {
			System.out.println(n);
		}
		
	}

}
