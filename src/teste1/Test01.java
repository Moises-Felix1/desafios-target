package teste1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		/*
		 * 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
		 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
		 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
		 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
		 * avisando se o número informado pertence ou não a sequência.
		 * 
		 * IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua
		 * preferência ou pode ser previamente definido no código;
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		int x = sc.nextInt();
		int a = 1, b = 0, c = 0;
		for (int i = 0; i < 10; i++) {
			if (x == c) {
				System.out.println("Sim");
				break;
			}
			c = a + b;
			a = b;
			b = c;
		}
		sc.close();
	}

}
