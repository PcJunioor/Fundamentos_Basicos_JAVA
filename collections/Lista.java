package collections;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		

		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Paulo");
		lista.add(u1);
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Xico"));
		lista.add(new Usuario("Pedro"));
		
		System.out.println(lista.get(4)); //ACESSAR PELO INDICE
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		
		
		
	}

}
