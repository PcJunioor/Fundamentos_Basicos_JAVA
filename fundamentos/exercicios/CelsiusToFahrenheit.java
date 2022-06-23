package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		
		double tempC;
		double tempF;
		
		String temp = JOptionPane.showInputDialog("Temperatura Celsius: ");
		tempC = Double.parseDouble(temp);
		
		tempF = tempC * (9 / 5.0) + 32;
		
		System.out.println("Temperatura em Fahrenheit: " + tempF);
		
	}

}
