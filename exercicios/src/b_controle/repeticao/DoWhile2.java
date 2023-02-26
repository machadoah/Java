package b_controle.repeticao;

import java.util.Scanner;

public class DoWhile2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String texto = "por favor";

		do {

			System.out.println("Você precisa falar as palavras mágicas ...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();

		} while (!texto.equalsIgnoreCase("por favor"));

		entrada.close();
		
		System.out.println("Obrigado!!");

	}

}
