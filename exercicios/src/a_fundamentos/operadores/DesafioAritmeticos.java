package a_fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {

//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		
//		System.out.println(b);
//		System.out.println(a);

		// LADO ESQUERDO
		double e1 = 6;
		double e2 = (3 + 2);
		double e3 = 3 * 2;
		double e4 = Math.pow((e1 * e2), 2);
		double et = e4 / e3; 
		
		// LADO DIREITO
		double d1 = (1-5);
		double d2 = (2 -7);
		double d3 = d1 * d2;
		double d4 = d3/2;
		double dt = Math.pow(d4, 2);
		
		// SUPERIOR
		double s = Math.pow(et - dt, 3);
		
		// INFERIOR
		double i = Math.pow(10, 3);
		
		// TOTAL
		double t = s/i;
		
		System.out.println(t);

	}

}
