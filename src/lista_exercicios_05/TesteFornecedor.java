package lista_exercicios_05;

public class TesteFornecedor {
	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor("Raissa", "(71)98323-1234", "Rua da Ladeira", 4210.0, 1300.0);
		System.out.println("Nome do fornecedor: " + fornecedor1.getNome());
		System.out.println("Telefone do fornecedor: " + fornecedor1.getTelefone());
		System.out.println("Endereco do fornecedor: " + fornecedor1.getEndereco());
		System.out.println("Saldo do fornecedor: " + fornecedor1.obterSaldo());
	}

}
