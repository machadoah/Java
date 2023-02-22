package a_fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// POS INCREMENTO/DECREMENTO
		
		a++; // a = a + 1 
		a--; // a = a - 1 
		
		// PRE INCREMENTO/DECREMENTO 
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		// DESAFIO
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--); // ++a incrementa 1 ao 'a' antes da comparação
										// b-- primeiro compara depois subtrai 1
		// so (2 == 2) ? TRUE
		
		System.out.println(a);
		System.out.println(b);

	}

}
