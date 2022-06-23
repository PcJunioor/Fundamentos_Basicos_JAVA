package fundamentos.exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Equação ax² + bx + c = 0");
		
		System.out.println("\nDigite o valor de A: ");
		int a = entrada.nextInt();
		
		System.out.println("\nDigite o valor de B: ");
		int b = entrada.nextInt();
		
		System.out.println("\nDigite o valor de C: ");
		int c = entrada.nextInt();
		
		
		double delta = ((Math.pow(b, 2)) - (4 * a * c));
		System.out.printf("Delta = %.2f",delta);
		
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.printf("\nx' = %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("\nx'' = %.2f", x2);
		
		entrada.close();
		
		
		
	}

}
