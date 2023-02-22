package b_controle;

import javax.swing.JOptionPane;

public class ControleIfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		} else { // else representa caso contrário
			System.out.println("Número impar!");
		}
		
	}

}
