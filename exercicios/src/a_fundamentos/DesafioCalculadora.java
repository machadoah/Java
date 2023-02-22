package a_fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		// Ler num1
		// Ler num2
		// + - * / %
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o 1º número: ");
		double num1 = input.nextDouble();
		
		System.out.print("\nInsira o 2º número: ");
		double num2 = input.nextDouble();
		
		System.out.print("\nInforme a operação: ");
		String op = input.next();
		
		// LOGIC
		
		double resultado;
		
		resultado = "+".equals(op)? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.1f %s %.1f = %.2f", num1, op, num2, resultado);
		
		
		input.close();
		

	}

}
