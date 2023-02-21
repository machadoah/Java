package a_fundamentos;

public class PrimitivoVsObjeto {
	// TUDO EM JAVA É OBJETOS MENOS OS TIPOS PRIMITIVOS

	public static void main(String[] args) {
		
		String s = "texto";
		String k = s.toUpperCase();
		
		// Wrappers são as versões objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
		System.out.println( s + k);

	}

}
