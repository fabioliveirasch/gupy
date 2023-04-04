package gupy;

public class FaturamentoDistribuidora {

	public static void main(String[] args) {

		double porcentagem = 0;

		double[] faturamento = { 67836.43, 36678.66, 29229.88, 27165.48, 19849.53 };
		double faturamentoMensal = 	faturamento[0] + 
									faturamento[1] + 
									faturamento[2] +
									faturamento[3] +
									faturamento[4];

		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				porcentagem = (faturamento[0] * 100) / faturamentoMensal;
				System.out.printf("São Paulo = %.2f", porcentagem);
				System.out.println("%");
			} else if (i == 1) {
				porcentagem = (faturamento[1] * 100) / faturamentoMensal;
				System.out.printf("Rio de Janeiro = %.2f", porcentagem);
				System.out.println("%");
			} else if (i == 2) {
				porcentagem = (faturamento[2] * 100) / faturamentoMensal;
				System.out.printf("Minas Gerais = %.2f", porcentagem);
				System.out.println("%");
			} else if (i == 3) {
				porcentagem = (faturamento[3] * 100) / faturamentoMensal;
				System.out.printf("Espírito Santo = %.2f", porcentagem);
				System.out.println("%");
			} else if (i == 4) {
				porcentagem = (faturamento[4] * 100) / faturamentoMensal;
				System.out.printf("Outros = %.2f", porcentagem);
				System.out.println("%");
			}
		}

		// Porcentagem = (valor obtido x 100) / Valor total

	}

}
