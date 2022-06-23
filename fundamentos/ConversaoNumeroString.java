package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 100000;
		
		System.out.println("Quantidade de character: " 
		+ num1.toString().length());
		
		System.out.println(num1);
		
		int num2 = 10000;
		
		System.out.println( num2 +" tem " + Integer.toString(num2).
				length() + " characteres");
	
		
	}

}
