package b_controle.condicionais;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		
		int numero = Integer.parseInt(valor);
		
		switch (numero) {
		case 1:
			System.out.println("Domingo");	
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sabádo");
			break;
		default:
			break;
		}
	}

}
