package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		
		System.out.println("Peso (Kg): ");
		Scanner entrada = new Scanner (System.in);
		double peso = entrada.nextDouble();
		
		System.out.println("Altura: ");
		String alt = entrada.next().replace(",", ".");
		//double altura = entrada.nextDouble();
		
		double altura = Double.parseDouble(alt);
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("IMC = %.2f", imc);
		
		
		entrada.close();
		
		
		
	}

}
