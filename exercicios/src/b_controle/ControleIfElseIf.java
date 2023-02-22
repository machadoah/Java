package b_controle;

import java.util.Scanner;

public class ControleIfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inválida.");
		} else if(nota >= 8.1) {
			System.out.println("Conceito A.");
		} else if(nota >= 7.6) {
			System.out.println("Conceito B");
		} else if(nota >= 5.5) {
			System.out.println("Conceito C");
		} else {
			System.out.println("Nota Vermelha, procure o coordenador do curso para fazer substitutiva.");
		}
		
		entrada.close();
	}

}
