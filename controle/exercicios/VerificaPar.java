package controle.exercicios;

import java.util.Scanner;

public class VerificaPar {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número de 0 a 10: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			System.out.println("ok...número válido");
			
			if(numero % 2 == 1 )
				System.out.printf("%d é ímpar", numero);
			else
				System.out.printf("%d é par", numero);
				
			
		}
		else
			System.out.println("Número inválido!!");
		

		entrada.close();
	}

}
