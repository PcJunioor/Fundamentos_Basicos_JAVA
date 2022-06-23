package controle.exercicios;

import java.util.Scanner;


public class VerificaBissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String ano = "";
		while (!ano.equalsIgnoreCase("SAIR")) {
			
			System.out.print("Digite o ano (sair para finalizar): ");
			ano = entrada.nextLine();
			if(ano.equalsIgnoreCase("SAIR")) {
				System.out.println("saindo...");
				break;
				
			}
			int anoInt = Integer.parseInt(ano);			
			
			if(anoInt %4 == 0 && anoInt %100 != 0 || anoInt %400 ==0)
				System.out.printf("%d é Bissexto\n", anoInt);
			else
				System.out.printf("%d Não é Bissexto\n", anoInt);
			
	
			
		}
		entrada.close();
	}
				
			
		
		
		
		
		

}


