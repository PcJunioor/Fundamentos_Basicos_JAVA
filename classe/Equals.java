package classe;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Paulo Cesar";
		u1.email = "paulocesar_cs@hotmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Paulo Cesar";
		u2.email = "paulocesar_cs@hotmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u1.equals(u2));
		 
	}

}
