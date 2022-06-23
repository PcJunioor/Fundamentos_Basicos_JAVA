package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		// trabalho na terça ( V OU F)
		// trabalho na quinta ( V OU F)
		
		// Se 2V comprar tv 50 polegadas
		// Se 1V comprar tv 32 polegadas
		// se 1V a familia toma sorvete
		// Se 2F ng sai
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Trabalho foi na terça(true ou false)?");
		boolean trabTer = entrada.nextBoolean();
		System.out.println("Trabalho foi na quinta?(true ou false)?");
		boolean trabQuin = entrada.nextBoolean();
			
		boolean compT50 = trabTer && trabQuin;
		System.out.println("Comprou TV de 50? " + compT50);
		
		boolean compT32 = trabTer ^ trabQuin;
		System.out.println("Comprou TV 32? " + compT32);
		
		boolean tomSor = trabTer || trabQuin;
		System.out.println("Foi ao shopping tomar Sorvete? " + tomSor);
		
		
		System.out.println("Ninguém saiu de de casa? " + !tomSor);
			
		entrada.close();
	}

}
