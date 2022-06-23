package desafioClasse;

import java.util.Scanner;


public class Jantar {
	
	public static void main(String[] args) {
		
		
		int opcao;
		String nomePessoa = "";
		double pesoPessoa = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o nome: ");
		nomePessoa = entrada.nextLine();
		System.out.println("Peso: ");
		pesoPessoa = entrada.nextDouble();
		
		Pessoa p1 = new Pessoa(nomePessoa, pesoPessoa);
		Comida c1 = new Comida(1, "Lasanha", 1);
		Comida c2 = new Comida(2, "Camarão Internacional", 2);
		
		System.out.println(c1.imprimirComida());
		System.out.println(c2.imprimirComida());
		System.out.println("Qual refeição deseja fazer?\n");
		opcao = entrada.nextInt();
		
		if(opcao == c2.getOpcao()) {
			p1.comerComida(c2);
			System.out.printf("Peso Atualizado!! + %.2f Kg\n", c2.getPesoComida());
		}
		
		if(opcao == c1.getOpcao()) {
			p1.comerComida(c1);
			System.out.printf("Peso Atualizado!! + %.2f Kg\n", c1.getPesoComida());
		}
		
		System.out.println(p1.imprimirPessoa());

		

		entrada.close();
	}

}
