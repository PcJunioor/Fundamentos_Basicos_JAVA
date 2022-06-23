package classe;

import java.util.Scanner;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Digite o raio: ");
		double raio = entrada.nextDouble();
		AreaCirc a = new AreaCirc(raio);
		System.out.println(a.area());
		
		System.out.println("Área 2: " + AreaCirc.area(raio));
		
		entrada.close();
	}

}
