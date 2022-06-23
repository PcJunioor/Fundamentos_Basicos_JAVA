package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		Scanner entrada = new Scanner(System.in);


		for(int i = 0; i < notasAlunoA.length; i++) {
			
		
			System.out.printf("Digite a nota do aluno %d: ", i + 1);
			notasAlunoA[i] = entrada.nextDouble();
					
		}
		for(int i = 0; i < notasAlunoA.length; i++) {
			System.out.printf("Nota %d: %.2f\n", i + 1, notasAlunoA[i]);
						
		}
		//ou IMPRIMIR ASSIM:
		System.out.println(Arrays.toString(notasAlunoA));
		entrada.close();
	}

}
