package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		// Ler num1 e num2
		// qual operação fazer " +  -  / * %
		
		String num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		String num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		String op = JOptionPane.showInputDialog("Qual a operação? (+) (-) (/) (*) (%)");
		
		double valor1 = Double.parseDouble(num1);
		double valor2 = Double.parseDouble(num2);
		
		double resultado = 0;
							
		resultado = "+".equals(op) ? valor1 + valor2 : 0;
		resultado = "-".equals(op) ? valor1 - valor2 : resultado;
		resultado = "*".equals(op) ? valor1 * valor2 : resultado;
		resultado = "/".equals(op) ? valor1 / valor2 : resultado;
		resultado = "%".equals(op) ? valor1 % valor2 : resultado;
		
		
		
		System.out.printf("%.2f %s %.2f = %.2f", valor1, op, valor2, resultado);

				
		
	}

}
