package generics;

import java.util.List;

public class ListUtil {
	public static Object getUltimo1(List<?> lista) { // List<?> LISTA DE QUALQUER COISA
		return lista.get(lista.size() - 1);
	}
	
	public static  <T> T getUltimo2(List<T> lista) { 
		return lista.get(lista.size() - 1);
	}
	// EXEMPLO DE GERERICS COM MAIS DE UM TIPO
	public static <A, B, C> C teste(A paramentroA, B parametroB) {
		C teste = null;
		return teste;
	}

}
