package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		
		System.out.println("Digite a base do Triângulo: ");
		Scanner entrada = new Scanner (System.in);
		double base = entrada.nextDouble();
		
		System.out.println("Digite a altura do Triângulo: ");
		double altura = entrada.nextDouble();
		double area = (base * altura) / 2;
		System.out.println("Área do Triângulo: " + area);
		
		entrada.close();
		
		
	}

}
