package a_fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações de um funcionário

		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int identificador = 56789;
		long pontosAcumulados = 3_234_845_223L; // '_' aux a organizar o nº
												// 'L' no final aponto que é um long
		
		// Tipos numéricos reais		
		float salario = 11445.44F; // 'F' no final aponta que é um literal float
		double vendasAcumuladas = 2_991_797_103.045;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo Caractere
		char status = 65; // representara o 'A' = '\u0065'
		
		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		//Numero de vigens
		System.out.println("Numero de viagens: " + numeroDeVoos/2 );
		
		// Pontos por real
		System.out.println("Pontos por real: " + pontosAcumulados/ vendasAcumuladas);
		
		System.out.println(identificador + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		
		// Qual o paramar do funcionario
		System.out.println("O patamar do funcionário é: " + status);
		
		
	}

}
