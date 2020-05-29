package avaliacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int horas;
		double vlrHora;
		char outro;
		
		do {
			System.out.print("Nome: ");
			nome = sc.next();
			do {
				System.out.print("Horas trabalhadas: ");
				horas = sc.nextInt();
			} while (horas <= 0.0);
			do {
				System.out.print("Valor por hora: ");
				vlrHora = sc.nextDouble();
			} while (vlrHora <= 0.0);
			System.out.print("Digitar outro (S/N)? ");
			outro = sc.next().toUpperCase().charAt(0);
		} while (outro != 'N');

		
		sc.close();
	}

}
