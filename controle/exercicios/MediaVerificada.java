package controle.exercicios;

import java.util.Scanner;

public class MediaVerificada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota 1: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a nota 2: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		
		if(media >= 7)
			System.out.printf("Média: %.2f >>>APROVADO!!", media);
		else if(media < 7 && media >4)
			System.out.printf("Média: %.2f >>>RECUPERAÇÃO!!", media);
		else 
			System.out.printf("Média: %.2f >>> REPROVADO!!", media);
		
		
		
		

		entrada.close();
	}

}
