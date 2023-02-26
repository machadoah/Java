package b_controle.condicionais;

public class Continue {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i % 2 == 1) {
				continue; // vai interromper somente os impares
			}

			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				continue; // vai interromper somente o 5
			}
			System.out.println(i);

		}

	}

}
