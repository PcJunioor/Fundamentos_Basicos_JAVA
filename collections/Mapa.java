package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Paulo");
		usuarios.put(3, "João");
		usuarios.put(4, "Rafael");
		
		System.out.println(usuarios);
		System.out.println(usuarios.size());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.values());
		
		System.out.println(usuarios.containsKey(5));
		System.out.println(usuarios.containsValue("Paulo"));
		System.out.println(usuarios.get(2));
		
		for(int chave: usuarios.keySet()) {
			System.out.print(chave + " - ");
		}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " - ");
			System.out.println(registro.getValue());
			
		}
		
		
		
		
	}

}
