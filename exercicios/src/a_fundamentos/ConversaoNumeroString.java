package a_fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer num1 = 10000;
		String j = num1.toString(); // Integer -> String
		
		System.out.println(j.length()); // tamanho
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2)); // Convertendo diretamente da classe Integer
		
		System.out.println("" + num2); // Convertendo int para String, concat com string vazia
		System.out.println(("" + num2).length()); // tamanho
		

	}

}
