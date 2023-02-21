package a_fundamentos;

import java.util.Scanner; // import para receber informações do usuário

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.println(" dia!");
		
		// %n pula linha
		
		System.out.printf("Mega-senha: %d %d %d %d %d %d .%n", 1,2,3,4,5,6);
		System.out.printf("Salário: %.2f %n", 1234.56789);
		
		
		//int a = 3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Digite o seu nome: ");
		String sobrenome = input.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();
		
		input.close();
		
		System.out.printf("%n%s %s tem %d anos", nome, sobrenome, idade);
	}

}
