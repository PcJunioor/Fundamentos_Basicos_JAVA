package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		double total = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantidade de alunos: ");
		int qtdeAl = entrada.nextInt();
		System.out.print("Quantidade de notas: ");
		int qtdeNo = entrada.nextInt();
		double[][] notas = new double[qtdeAl][qtdeNo];
		
		
		for(int a = 0; a < notas.length; a++) {
			for(int n = 0; n < notas[a].length; n++) {
				System.out.printf("Nota %d do aluno %d: ",(n + 1), (a + 1));
				notas[a][n] = entrada.nextDouble();
				total += notas[a][n];  
				
				
			}
		}
		
		double media = total / (qtdeAl * qtdeNo);
		
		for(int a = 0; a < notas.length; a++) {
			for(int n = 0; n < notas[a].length; n++) {
				System.out.printf("Aluno %d >>> Nota %d: %.2f \n",(a + 1), (n + 1), notas[a][n] );
			}
		}
		// OUTRA FORMA DE EXIBIR A MATRIZ
		
		for(double[] nota: notas) {
			System.out.println(Arrays.toString(nota));
		}
		
		
		System.out.println("Média da turma é: " + media);
		entrada.close();
	}

}
