package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Paulo", 10);
		Aluno a2 = new Aluno("Ana", 6);
		Aluno a3 = new Aluno("Julia", 4);
		Aluno a4 = new Aluno("Gui", 7.2);
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 6;
		Function<Aluno, Double> getNota = a -> a.nota;
		BinaryOperator<Double> somatoria = (a, b) -> a + b;
		
		alunos.parallelStream().filter(aprovado)
			.map(getNota)
			.reduce(somatoria)
			.ifPresent(System.out::println);
		
	}

}
