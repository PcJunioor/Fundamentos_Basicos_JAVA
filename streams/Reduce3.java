package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Paulo", 10);
		Aluno a2 = new Aluno("Ana", 6);
		Aluno a3 = new Aluno("Julia", 4);
		Aluno a4 = new Aluno("Gui", 7.2);
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 6;
		Function<Aluno, Double> getNota = a -> a.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) ->  media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);
		
		
		
		// MEDIA DOS ALUNOS APROVADOS
		double resultado = alunos.stream()
			.filter(aprovado)
			.map(getNota)
			.reduce(new Media(), calcularMedia, combinarMedia)
			.getValor();
		System.out.println(resultado);
		
		// OUTRA FORMA
		Media media = alunos.stream()
				.filter(aprovado)
				.map(getNota)
				.reduce(new Media(), calcularMedia, combinarMedia);
		System.out.println(media.getValor());
		System.out.println("TESTANDO ALTERAÇÃO NO GITHUB!!!");
		
	}

}
