package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// MOstrar a média no final
		// sair ao digitar -1
		// nota no intervalo de 0 a 10
		int cont = 0;
		double nota = 0;
		double total = 0;
		Scanner entrada = new Scanner(System.in);

		

		
		while(nota != -1) {
			System.out.print("Digite a nota: (-1 para sair)");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				cont ++;
			}
			
			if (nota == -1)
				System.out.println("saindo...");
			
			if(nota < -1 || nota > 10)
				System.out.println("Nota inválida!! Digitar no intervalo de 0 a 10");
			
		
		}
		double media = total / cont;
		
		System.out.printf("Total de alunos: %d \nMédia: %.2f", cont, media);
		entrada.close();
		
				
	}

}
