package a_fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2"); 
		System.out.println(s == "2"); // False
		System.out.println("2".equals(s)); // True
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); // Next retira os espaços em branco
		System.out.println("2" == s2.trim()); // trim retira os espaços em branco
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		

	}

}
