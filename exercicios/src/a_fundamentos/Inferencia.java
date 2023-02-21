package a_fundamentos;

public class Inferencia {
	// usando o var, o java infere um tipo para a variavel, pelo valor atribuido

	public static void main(String[] args) {

		double a = 4.5; // variável foi declarada e inicializada
		System.out.println(a);
		
		a = 12;
		System.out.println(a);

		var b = 4.5;
		System.out.println(b);

		var c = "Texto";
		System.out.println(c);

		c = "Outro Texto";
		System.out.println(c);

		// c = 4.5; até então a variável 'a' foi utilizada como
		// String, não pode ter seu tipo modificado
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // variável foi usada!
		
		// Para usar o 'var' é necessário delara-lá e inicializa-lá na mesma linha;
		
		var f = 12; // inteiro
		// var = 12.00001; Não funciona pois não é possivel em int armazenar casas decimais 
		System.out.println(f);
		
		
		
	}

}
