public class Produto_Num_Impares_06 {

	public static void main(String[] args) {

		// Tipo int
		int produtoInt = 1;
		for (int num = 15; num <= 30; num++) {
			if (num % 2 == 1) {
				produtoInt *= num;
			}
		}
		System.out.println("Produto dos ímpares (int): " + produtoInt);

		// Tipo float
		float produtoFloat = 1;
		for (int num = 15; num <= 30; num++) {
			if (num % 2 == 1) {
				produtoFloat *= num;
			}
		}

		System.out.println("Produto dos ímpares (float): " + produtoFloat);
	}
}
