package avaliacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, ganhouMais;
		int horas, menu, totalHoras;
		double vlrHora, custoTotal, maiorValor, vlrAtual;
		char outro;
		ganhouMais = "";
		totalHoras = 0;
		custoTotal = 0.0;
		maiorValor = 0.0;
		
		do {
			System.out.print("Nome: ");
			nome = sc.next();
			do {
				System.out.print("Horas trabalhadas: ");
				horas = sc.nextInt();
			} while (horas <= 0.0);
			totalHoras += horas;
			do {
				System.out.print("Valor por hora: ");
				vlrHora = sc.nextDouble();
			} while (vlrHora <= 0.0);
			custoTotal += horas * vlrHora;
			vlrAtual = horas * vlrHora;
			if(vlrAtual >= maiorValor) {
				ganhouMais = nome;
				maiorValor = vlrAtual;
			}
			System.out.print("Digitar outro (S/N)? ");
			outro = sc.next().toUpperCase().charAt(0);
		} while (outro != 'N');

		do {
			System.out.println();
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opção: ");
			menu = sc.nextInt();
			System.out.println();
			
			if (menu == 1) {
				System.out.println("Total de horas = " + totalHoras);
			} else if (menu == 2) {
				System.out.printf("Custo total = R$ %.2f%n", custoTotal);
			} else if (menu == 3) {
				System.out.println("Pessoa que ganhou mais: " + ganhouMais);
			}
		} while (menu != 4);

		System.out.println("FIM DO PROGRAMA!");
		
		sc.close();
	}

}
