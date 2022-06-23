package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
	public static void main(String[] args) {
		int tentativas = 10;
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		int numeroRandom = random.nextInt(100);
		//System.out.println(numeroRandom);
		
		while(tentativas > 0) {
			System.out.print("Tente advinhar um número de 0 a 100 (10 Tentativas)");
			int numero = entrada.nextInt();
			if(numero >= 0 && numero <= 100) {
				
				if(numero > numeroRandom) {
					System.out.println("Errou!!! número digitado foi maior");
				}
				if(numero < numeroRandom) {
					System.out.println("Errou!!! número digitado foi menor");
				}
				if(numero == numeroRandom) {
					System.out.println("ACERTOU!!!!");
					break;
				}
				
			}
			else {
				System.out.println("Número inválido, tente novamente!");
				tentativas ++;				
			}
			
			
			tentativas --;
			System.out.printf("Tentativas Restantes: %d \n",tentativas);
						
		}
		
		entrada.close();
	}

}
