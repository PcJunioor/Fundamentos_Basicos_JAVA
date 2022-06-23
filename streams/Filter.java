package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 9.2);
		Aluno a2 = new Aluno("Bia", 6.4);
		Aluno a3 = new Aluno("Gui", 3.8);
		Aluno a4 = new Aluno("Lia", 7.1);
		Aluno a5 = new Aluno("Pedro", 5.8);
		Aluno a6 = new Aluno("Paulo", 6.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> isAprovado = a -> a.nota >= 6;
		Function<Aluno, String> saudacao = a -> "Parabéns " + a.nome + " Aprovado(a)";
		
		alunos.stream()
			.filter(isAprovado)
			.map(saudacao)
			.forEach(System.out::println);
		
	}

}
