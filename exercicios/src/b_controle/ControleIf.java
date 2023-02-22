package b_controle;

import java.util.Locale;
import java.util.Scanner;

public class ControleIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		//entrada.useLocale(Locale.US);

		System.out.println("Informe a media: ");
		double media = entrada.nextDouble();

		if (media >= 7.0 && media <= 10) {

			System.out.println("Aprovado");
			System.out.println("Parabens");

		}

		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}

		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado");
		}
		
		entrada.close();

	}

}
