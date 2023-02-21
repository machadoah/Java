package a_fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {

		double raio = 3.4;
		final double PI = 3.14159;
		// final define que a variável é uma constante
		// contante por convernção, possui seu id maiusculo
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + " m²");

	}

}
