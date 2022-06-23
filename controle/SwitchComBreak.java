package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		String conceito = "";
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		
		int nota = entrada.nextInt();
		
		
		switch (nota) {
		case 10: case 9: 
			conceito = "A";
			break;
		
			
		case 8: case 7: 
			conceito = "B";
			break;
			
			
		case 6: case 5: 
			conceito = "C";
			break;
			
		
		default:
			System.out.println("Reprovado!!");
			
		
			
		}
		
		if(nota >= 5)
			System.out.println("Conceito é " + conceito);
		
		
		entrada.close();
	}

}
