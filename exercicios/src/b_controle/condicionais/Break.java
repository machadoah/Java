package b_controle.condicionais;

public class Break {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break; // Sai do for
			}
			
			System.out.println(i);
		}
		
		System.out.println("FIM");
		
	}

}
