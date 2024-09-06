package teste2;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		/*
		 * 02) Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
		 * seja maiúscula ou minúscula, além de informar a quantidade de vezes em que
		 * ela ocorre.
		 * 
		 * IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua
		 * preferência ou pode ser previamente definida no código;
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a String");
		String x = sc.nextLine();

		String str = x.toLowerCase();

		int con = 0;
		if (str.contains("a")) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a') {
					con++;
				}
			}
			System.out.println("A letra 'a' aparece " + con + " vez(es) na string.");
		} else {
			System.out.println("A String informada não contém a letra 'a'");
		}

		sc.close();
	}

}
