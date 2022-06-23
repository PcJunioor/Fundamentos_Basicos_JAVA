package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Paulo", 10);
		Aluno a2 = new Aluno("Ana", 6);
		Aluno a3 = new Aluno("Julia", 4);
		Aluno a4 = new Aluno("Gui", 7.2);
		Aluno a5 = new Aluno("Paulo", 10);
		Aluno a6 = new Aluno("Luna", 6);
		Aluno a7 = new Aluno("Maria", 4);
		Aluno a8 = new Aluno("Gui", 7.2);
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		// REMOVER DUPLICADOS
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream().skip(2).limit(1).forEach(System.out::println);
		System.out.println("TESTE ALTERAR GITHUB");
		
		
	}
	

}
