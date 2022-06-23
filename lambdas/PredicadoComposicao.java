package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num %2 == 0;
		Predicate<Integer> istresDigitos = num->  num >= 100 && num <= 999;
		
		System.out.println(isPar.test(3));
		System.out.println(istresDigitos.test(900));
		
		System.out.println(isPar.and(istresDigitos).test(122));
	}

}
