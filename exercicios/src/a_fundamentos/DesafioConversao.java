package a_fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		// DESAFIO CONVERSAÕ

		// Utilizando o Scanner pegue 3 strings com salarios
		// calcular a média, mas o funcionário pode separar as casas com ',' ou com '.'

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe seu 1º salário: ");
		String salario1 = entrada.nextLine().replace(",", "."); // Substitui ',' por '.'
		double sal1 = Double.parseDouble(salario1); // String -> double

		System.out.println("Informe seu 2º salário: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		double sal2 = Double.parseDouble(salario2);

		System.out.println("Informe seu 3º salário: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		double sal3 = Double.parseDouble(salario3);

		double media = ((sal1 + sal2 + sal3) / 3);
		
		System.out.println("A média dos salários é " + media);

	}

}
