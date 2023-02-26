package b_controle.repeticao;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		while(contador <= 10) {
			//System.out.println("Bom dia"); // será impresso 'Bom dia'
			
			System.out.printf("i = %d\n", contador);
			
			contador++; // Possibilita que o laço deixe de ser infinito
		}
		
	}

}
