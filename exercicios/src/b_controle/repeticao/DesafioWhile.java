package b_controle.repeticao;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {

			System.out.printf("\nInforme a nota do aluno %d (OU -1 para sair): ", quantidadeDeNotas+1);

			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else {
				System.out.println("Nota invalida!");
			}

		}

		double media = total / quantidadeDeNotas;

		System.out.println("Média = " + media);

		entrada.close();

	}
}
