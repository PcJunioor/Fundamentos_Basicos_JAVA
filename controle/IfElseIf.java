package controle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in).useLocale(Locale.US);
		System.out.print("Digite a média");
		double nota = entrada.nextDouble();
		var media = 8 / 5.0;
		System.out.println(media);
		
		if(nota > 10 || nota < 0)
			System.out.println("Nota inválida");
		else if (nota >= 8.1)
			System.out.println("Conceito A");
		else if (nota >= 6.1)
			System.out.println("Conceito B");
		else if (nota >= 5.1)
			System.out.println("Conceito C");
		else if (nota >= 4.1)
			System.out.println("Conceito D");
		else if (nota >= 3.1)
			System.out.println("Conceito E");
		
		
		entrada.close();
		System.out.println(nota);
	}

}
