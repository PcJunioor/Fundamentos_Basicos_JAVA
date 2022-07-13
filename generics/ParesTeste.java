package generics;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(3, "Ana");
		resultadoConcurso.adicionar(4, "Gui");
		resultadoConcurso.adicionar(2, "Paulo");
		
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(1));
	}

}
