package b_controle.condicionais;

import javax.swing.JOptionPane;

public class DesafioDiaSemana2 {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("O dia da semana: ");

		if (valor.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (valor.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (valor.equalsIgnoreCase("terça")) {
			System.out.println(3);
		} else if (valor.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (valor.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (valor.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if (valor.equalsIgnoreCase("sabádo")) {
			System.out.println(7);
		}
	}

}
