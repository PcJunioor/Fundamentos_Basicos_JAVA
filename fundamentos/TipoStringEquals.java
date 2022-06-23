package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); // compara a string e não o conteúdo dela
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.nextLine();  // O entrada.next() automaticamente tira os espaços da STRING
		System.out.println("22".equals(s2.trim())); //TRIM tira os espaços da string
		
		entrada.close();
		
		
		
		
	}

}
