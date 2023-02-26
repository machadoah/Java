package b_controle.repeticao;

// control + shift + O => Organiza os imports

public class DoWhile {

	public static void main(String[] args) {

		double index = 3.7;

		do { // Será executado pelo menos uma vez

			System.out.printf("index = %.1f\n", index);
			index += 0.1;

		} while (index >= 4); 
		

	}

}
