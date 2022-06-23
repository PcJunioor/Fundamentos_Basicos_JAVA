package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {
		
		double a = 1; //conversão implícita
		System.out.println(a);
		
		float b =  (float) 1.0;  //conversão explícita (CAST)
		System.out.println(b);  
		
		int c = 4;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; //explícita (CAST)
		System.out.println(f);
	}

}
