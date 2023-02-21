package a_fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Olá pessoal".charAt(0)); // letra do indice 0

		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!!");
		System.out.println(s.startsWith("Boa")); // A string inicia com Boa?
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length()); // Qual o tamanho?
		System.out.println(s.endsWith("tarde")); // A string termina com tarde?
		System.out.println(s.equalsIgnoreCase("Boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;

		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\n\n");

		// string %s
		// int %d
		// real %f
					// %.2f -> irá exibir só 2 casas decimais

		System.out.printf("O senhor %s %s tem %d e ganha %.2f \n", nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d e ganha %.2f", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 9)); // 6 é inclusivo e 9 é exclusivo
	}

}
