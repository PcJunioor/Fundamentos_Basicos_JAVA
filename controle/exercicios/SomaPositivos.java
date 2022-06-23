package controle.exercicios;

import java.util.Scanner;

public class SomaPositivos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero = 0;
		double soma = 0;
		
		while (numero >= 0) {
			
			System.out.print("Digite um numero (digite número negativo p/sair): ");
			numero = entrada.nextDouble();
			if(numero < 0) {
				System.out.println("saindo...");
				break;
			}
			soma += numero;
			System.out.printf("Soma: %.2f \n", soma);
			
			
		}
		
		
		entrada.close();
	}

}
