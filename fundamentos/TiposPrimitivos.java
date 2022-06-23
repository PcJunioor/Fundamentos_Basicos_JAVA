package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
			
		// Tipos numérios inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // >> =3.234.845.223 "L" long
		
		// Tipos numérios reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A'; // só aceita 1 letra
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": Ganha->"+ salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Classe: " + status);
		
	}

}
