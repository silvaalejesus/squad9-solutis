public class TesteFornecedor {
	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor("Raissa", "(71)98323-1234", "Rua da Ladeira", 4210.0, 1300.0);

		System.out.println("---------- Fornecedor ----------");

		System.out.println("Nome do fornecedor: " + fornecedor.getNome());
		System.out.println("Telefone do fornecedor: " + fornecedor.getTelefone());
		System.out.println("Endereco do fornecedor: " + fornecedor.getEndereco());
		System.out.println("Saldo do fornecedor: R$ " + fornecedor.obterSaldo());

		System.out.println("--------------------------------");
	}

}
