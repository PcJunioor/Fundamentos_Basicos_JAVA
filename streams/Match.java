package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Paulo", 10);
		Aluno a2 = new Aluno("Ana", 6);
		Aluno a3 = new Aluno("Julia", 2);
		Aluno a4 = new Aluno("Gui", 7.2);
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 6;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		// FUNÇÕES TERMINADORAS ALLMATCH ANYMATCH E NONEMATCH
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));
	}

}
