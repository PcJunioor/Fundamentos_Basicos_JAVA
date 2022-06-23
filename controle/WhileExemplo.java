package controle;

import java.util.Scanner;

public class WhileExemplo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String comando = "";
		
		while(!comando.equalsIgnoreCase("SAIR")) {
			System.out.print("Digite o comando: ");
			comando = entrada.nextLine().toUpperCase();
			System.out.println("Comando digitado: " + comando);
			
		}
		
		
		
		
		
		
		entrada.close();
		
		
	}

}
