package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota do primeiro semestre: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a nota do segundo semestre: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Teve bom comportamento?(true/false) ");
		boolean bomComportamento = entrada.nextBoolean();
		
		
		double media = (nota1 + nota2) / 2;
		String resultado = media >= 7.0 ? "Aprovado" : "Recuperação"; // "?" e ":"  Operadores ternarios
		System.out.println("Nota: " + media + "O aluno está de " + resultado);
		
		boolean passouPorMedia = media >= 6;
		boolean temDesconto = bomComportamento || passouPorMedia;
		String resultadoFinal = temDesconto ? "sim" : "não";		
		
		System.out.println("Passou Por bom comportamento: " + resultadoFinal);
		
		
		
		System.out.println("");	
		
		
		
		
		
		
		
		entrada.close();
	
	}

}
