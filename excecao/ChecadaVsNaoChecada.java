package exceção;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e1) {
			System.out.println(e1.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
		System.out.println("Fim!!");
		
		
	}
	// EXCEÇÃO NÃO CHECADA OU NÃO VERIFICADA
	public static void geraErro1() throws RuntimeException{
		 throw new RuntimeException("Erro Runtime");
		
	}
	// EXCEÇÃO CHECADA OU VERIFICADA
	public static void geraErro2() throws Exception{
		 throw new Exception("Erro Exception");
		
	}

}
