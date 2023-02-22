package a_fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.6;
		
		
		String resultadoParcial = media >= 5 ? "Recuperação" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
							  // CONDIÇÃO	 ? VERDADADE  : 	 FALSA
		
		System.out.println("O aluno está em situação de " + resultadoFinal);

	}

}
