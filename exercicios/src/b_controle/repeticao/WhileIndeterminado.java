package b_controle.repeticao;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String saida = "queijo";
		
		while(!(saida.equalsIgnoreCase("sair"))) {
			
			System.out.print("Digite algo ... :");
			
			saida = input.next().toLowerCase();
			
		}
	
		
		input.close();
	}

}
