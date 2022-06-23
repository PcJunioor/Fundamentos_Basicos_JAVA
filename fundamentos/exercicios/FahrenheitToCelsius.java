package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		
		
		double tempF;
		double tempC;
		
		String temp = JOptionPane.showInputDialog("Qual a temperatura (F): ");
		tempF = Double.parseDouble(temp);
		
		tempC = (tempF - 32) / 18000;
		System.out.println("Temperatura em °C: " + tempC);
	}

}
