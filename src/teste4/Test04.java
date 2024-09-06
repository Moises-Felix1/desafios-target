package teste4;

public class Test04 {

	public static void main(String[] args) {
		/*4) Descubra a lógica e complete o próximo elemento:
			a) 1, 3, 5, 7, ___
			b) 2, 4, 8, 16, 32, 64, ____
			c) 0, 1, 4, 9, 16, 25, 36, ____
			d) 4, 16, 36, 64, ____
			e) 1, 1, 2, 3, 5, 8, ____
			f) 2,10, 12, 16, 17, 18, 19, ____
		*/
	//Esta é uma sequência de números ímpares consecutivos.
	for(int i = 1; i<=10; i++) {
		if(i % 2!= 0) {
			System.out.print(" "+i);
		}
	}
	System.out.println();
	
	//Cada número é o dobro do anterior (multiplicação por 2).
	int x = 1;
	for(int i = 1; i < 8; i++) {
		x*= 2;
		System.out.print(" "+x);
	}
	System.out.println();
	
	//Esta sequência é formada pelos quadrados dos números naturais.
	for(int i = 0; i <= 7; i++) {
		System.out.print(" "+Math.pow(i, 2));
	}
	System.out.println();
	
	//Esta sequência é formada pelos quadrados dos números pares.
	for(int i = 2; i <= 10; i = i+=2) {
		System.out.print(" "+Math.pow(i, 2));
	}
	System.out.println();
	
	//Esta é a sequência de Fibonacci, onde cada número é a soma dos dois anteriores.
	int a = 1, b = 0, c = 0;
	for (int i = 0; i < 7; i++) {
		c = a + b;
		System.out.print(" "+c);
		a = b;
		b = c;
	}
	System.out.println();
	
	/*Todos começam com a letra “d” quando escritos por extenso em português: dois, dez, doze, 
	dezesseis, dezessete, dezoito, dezenove. O próximo número que começa com “d” é duzentos.*/
	int[] sequencia = {2, 10, 12, 16, 17, 18, 19, 200};
    
    for (int numero : sequencia) {
        System.out.print(" "+numero);
    }
  }
}
