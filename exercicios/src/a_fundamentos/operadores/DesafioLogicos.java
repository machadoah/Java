package a_fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça	(V ou F)
		// Trabalho na quinta	(V ou F)
		
		// Se os 2 derem certo uma de 50'
		// Se um der certo uma de 32'
		
		// Se ao menos um der certo ir tomar sorvete
		
		// Nenhum deu certo ficar em casa
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		
		boolean tomarSorvete = trabalho1 || trabalho2;
		
		boolean ficarEmCasa = !tomarSorvete;
		
		System.out.println("Comprou TV 50\" ? " + comprouTv50);
		System.out.println("Comprou TV 32\" ? " + comprouTv32);
		System.out.println("Tomou sorvete? " + tomarSorvete);
		System.out.println("Ficou mais saudável?" + ficarEmCasa);
		
		

	}

}
