package exceção.personalizadaA;

import exceção.Aluno;

public class TesteValicacoes {
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException | numeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
		
	}

}
