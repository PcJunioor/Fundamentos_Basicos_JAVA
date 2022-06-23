package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pesssoal".charAt(2)); // Pega o índice da String
		
		String s = "Boa Tarde";
		System.out.println(s.concat(" !!!"));
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = "Boa Tarde";
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		int idade = 33;
		var salario = 12345.987; 
		var teste = 33;
		String maisUmaFrase = "Nome: " + nome + " "+sobrenome +
				"\nIdade: " + idade + "\nSalario: " + salario;
		
		System.out.println(maisUmaFrase);
		
		System.out.printf("idade: %d%n", teste);
		System.out.printf("O Senhor %s %s tem %d anos e ganha %.2f \n", 
				nome, sobrenome, idade, salario);
		
		System.out.println("frase qualquer".toLowerCase()
				.contains("Qualquer".toLowerCase()));
		 
		
	}

}
