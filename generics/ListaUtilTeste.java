package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("PHP", "Java", "Phyton", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		Integer ultimoNum = (Integer) ListUtil.getUltimo1(nums);
		System.out.println(ultimoNum);
		
		String ultimaLang = (String) ListUtil.getUltimo1(langs);
		System.out.println(ultimaLang);
		// NÃO PRECISOU DO CAST
		String ultimaLang2 = ListUtil.getUltimo2(langs);
		System.out.println(ultimaLang2);
		
		Integer ultimoNum2 = ListUtil.getUltimo2(nums);
		System.out.println(ultimoNum2);
	}

}
