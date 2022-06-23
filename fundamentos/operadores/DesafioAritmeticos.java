package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
					
		double part1 = Math.pow(6*(3 + 2), 2) / (3 * 2);
		
		double part2 = (1 - 5) * (2 - 7) / 2;
		double part3 = Math.pow(part2, 2);
		double part4 = Math.pow(part1 - part3, 3);
		double part5 = Math.pow(10, 3);
	
		double resultado = part4 / part5;
		
				

		System.out.println("O resultado final é: " + resultado);
	}

}
