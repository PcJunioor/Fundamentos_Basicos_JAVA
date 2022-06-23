package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("BOm");
		System.out.print("Dia");
		var frase = "Megasena: ";
		System.out.printf("\n%s: %d %d %d %d %d %d", frase, 1,2,3,4,5,6);
		System.out.printf("\nSalário: %.2f", 12345.5650);
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String  nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String  sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int  idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos de idade", 
				nome, sobrenome, idade);
		
		entrada.close();
	}

}
