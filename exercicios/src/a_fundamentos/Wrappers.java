package a_fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// byte
		Byte b = 100;

		// short
		Short s = 1000;

		// int
		Integer i = 100000; // int

//		i = Integer.parseInt("100000"); // converter um string para inteiro
//		i = Integer.parseInt(input.nextLine());

		// long
		Long l = 100000000L; // 'L' no final indica que é long

		System.out.println(b.byteValue());
		System.out.println(s.toString()); // Byte -> String/Texto
		System.out.println(i * 3);

		input.close();

		System.out.println(l / 3);

		// boolean
		Boolean bo = Boolean.parseBoolean("true"); // string -> boolean
		System.out.println(bo);

		System.out.println(bo.toString().toUpperCase()); // true -> TRUE

		// char
		Character c = '#';
		System.out.println(c + "#...");

		// float

		Float f = 123.58F;
		System.out.println(f);

		// double
		Double d = 122343.834;
		System.out.println(d);

	}

}
