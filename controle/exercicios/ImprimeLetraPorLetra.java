package controle.exercicios;

import java.util.Scanner;

public class ImprimeLetraPorLetra {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma frase: ");

		String frase = entrada.nextLine().toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			
			char c[] = frase.toCharArray(); //char c = frase.charAt(i);
			System.out.printf("%s ", c[i]);
		}
		

		entrada.close();
	}

}
