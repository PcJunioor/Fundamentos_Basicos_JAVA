package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		//Domingo -> 1
		//Quarta -> 4
		//terça -> 3
		//digitar o dia da semana e retornar o numero do dia na semana
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("DOMINGO"))
			System.out.println("1");
		else if(dia.equalsIgnoreCase("SEGUNDA"))
			System.out.println("2");
		else if(dia.equalsIgnoreCase("TERÇA"))
			System.out.println("3");
		else if(dia.equalsIgnoreCase("QUARTA"))
			System.out.println("4");
		else if(dia.equalsIgnoreCase("QUINTA"))
			System.out.println("5");
		else if(dia.equalsIgnoreCase("SEXTA"))
			System.out.println("6");
		else if(dia.equalsIgnoreCase("SÁBADO"))
			System.out.println("7");
		
		else
			System.out.println("Dia inválido!!!");
	
		
		
		
		
		
		entrada.close();
		
	}

}
