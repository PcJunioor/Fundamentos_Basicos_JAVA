package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1)
					break; // FAZ O BREAK NO FOR INTERNO (J)
				System.out.printf("[%d %d] ",i , j);
				
			}
			System.out.println();
		}
		
		
		System.out.println("FOR COM BREAK ROTULADO");
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1)
					break externo; // FAZ O BREAK NO FOR EXTERNO (i) criando um rótulo "externo"
				System.out.printf("[%d %d] ",i , j);
				
			}
			System.out.println();
		}
		
	System.out.println("FIM...");
	}

}
