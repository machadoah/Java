package c_classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		d1.dia = 27;
		d1.mes = "Maio";
		d1.ano = 2004;
		
		System.out.printf("A data fornecida foi %d de %s de %d.", d1.dia, d1.mes, d1.ano);
		System.out.println();
		
		Data d2 = new Data();
		
		d2.dia = 18;
		d2.mes = "Maio";
		d2.ano = 1979;
		
		System.out.printf("A data fornecida foi %d de %s de %d.", d2.dia, d2.mes, d2.ano);
		
	}

}
