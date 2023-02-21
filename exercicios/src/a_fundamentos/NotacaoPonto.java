package a_fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		double a = 2.3;
		String s = "Bom dia X!";

		s = s.replace("X", "Senhora"); // Substituira X por Senhora
		s = s.toUpperCase(); // Toda a String s em letra maiuscula
		s = s.concat("!!!"); // Antiga string + '!!!'

		System.out.println(s); // Utilização do método toUpperCase();

		System.out.println("Leo".toUpperCase());

		String y = s
				.replace("SENHORA", "Ivo") // Troca SENHORA por Ivo
				.toUpperCase() 				// deixa tudo maiusculo
				.concat("!!!!");

		System.out.println(y);
		
		//Tipos primitivos não possuem o operador ponto!!!
		
		System.out.println("Isso é um double: " + a);
		
		

	}

}
