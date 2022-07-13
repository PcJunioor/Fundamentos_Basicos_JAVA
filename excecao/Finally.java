package excecao;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double resultado = 0;
		try {
			resultado = 7 / entrada.nextInt();
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally...");
		}
		
		
		try {
			System.out.println(resultado = 7 / entrada.nextInt());
		} finally {
			System.out.println("finally 2");
			entrada.close();
		}
		System.out.println(resultado);
		

	}

}
