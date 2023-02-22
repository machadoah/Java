package a_fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		// COMPARAÇÃO 
		
		int a = 97;
		int b = 'a'; // 'a' na unicode equivale a 97
		char c = 97; // 
		
		System.out.println(a == b && b == c); 
		
		// MAIOR
		System.out.println(3 > 4);
		
		// MENOR
		System.out.println(3 < 4);
		
		// MAIOR OU IGUAL
		System.out.println(3 >= 4);
		
		// MENOR OU IGUAL
		System.out.println(3 <= 4);
		
		//DIFERENTE
		System.out.println(3 != 4);
		
		double nota = 7.4;
		
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto: " + temDesconto);
	}

}
