package fundamentos.exercicios;

import java.util.Scanner;

public class Exponencial {
	
	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner (System.in);
		double numero = entrada.nextDouble();
		System.out.printf("%.2f ² = %.2f", numero, Math.pow(numero, 2));
		System.out.printf("\n%.2f ³ = %.2f",numero, Math.pow(numero, 3));
		
		entrada.close();
		
		
	}

}
