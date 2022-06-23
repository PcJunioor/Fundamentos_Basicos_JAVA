package controle.exercicios;

import java.util.Scanner;

public class MaiorDeDez {
	public static void main(String[] args) {
		
		int cont = 1;
		int maior = 0;
		Scanner entrada = new Scanner(System.in);
		
		while (cont <= 10) {
			System.out.printf("Digite o %d° numero : ", cont);
			int numero = entrada.nextInt();
			
			if(numero > maior) {
				maior = numero;
				
			}
			
			cont ++;
			
			
		}
		
		System.out.println("Maior número digitado foi: " + maior);
		

		entrada.close();
	}

}
