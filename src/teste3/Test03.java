package teste3;

public class Test03 {

	public static void main(String[] args) {
		/*
		 * 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1;
		 * enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
		 * 
		 * Ao final do processamento, qual será o valor da variável SOMA?
		 */
		
		int indice = 13, soma = 0, k = 0;
		for (int i = 0; k < indice; i++) {
			k += 1;
			soma += k;
		}
		System.out.println(soma);
	}

}
