package gupy;

public class Pergunta1 {

	public static void main(String[] args) {
		int INDICE = 13, SOMA = 0, K = 0;

		do {
			K = K + 1;
			SOMA = SOMA + K;
		} while (K < INDICE);

		System.out.println(SOMA);
	}

}
