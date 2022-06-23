package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Você precisa digitar as palavras mágicas: ");
			System.out.println("quer Sair? ");
			texto = entrada.nextLine();
						
		} while (!texto.equalsIgnoreCase("POR FAVOR"));
		
		System.out.println("saindo...");

		entrada.close();
		
	
	}

}
