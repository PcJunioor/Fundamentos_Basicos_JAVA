package excecao;

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
	// EXCE��O N�O CHECADA OU N�O VERIFICADA
	public static void geraErro1() throws RuntimeException{
		 throw new RuntimeException("Erro Runtime");
		
	}
	// EXCE��O CHECADA OU VERIFICADA
	public static void geraErro2() throws Exception{
		 throw new Exception("Erro Exception");
		
	}

}
