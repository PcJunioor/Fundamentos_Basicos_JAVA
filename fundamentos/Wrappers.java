package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// byte
		Byte b = 1;
		Short s = 1000;
		Integer i;
		Long l = 100000L;
		Boolean bo = Boolean.parseBoolean("True");
		
		
		System.out.print("Digite a idade: ");
		i = entrada.nextInt();
		
		Float f = 123.25F;
		System.out.println(f);
		
		Double d = 123.5678;
		System.out.println(d);
		
		System.out.println(b.byteValue());
		System.out.println(Short.valueOf(s));
		System.out.println("Idade: " + i.intValue());
		System.out.println(l / 2);
		System.out.println(bo);
		
		Boolean bool = Boolean.parseBoolean("false");
		System.out.println(bool);
		System.out.println(bool.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c +"...");
		

		
		entrada.close();
 	}

}
