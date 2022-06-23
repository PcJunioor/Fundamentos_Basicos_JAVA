package controle;

import java.util.Scanner;

public class DesafioIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();

		
		if (nota >= 9.0){
			System.out.println("Quadro de Honra");
			System.out.println("Você é fera");
		}
		
		if(nota >= 7 && nota < 9)
			System.out.println("Aprovado");
		if(nota < 7)
			System.out.println("Reprovado");
		
		entrada.close();
	}

}
