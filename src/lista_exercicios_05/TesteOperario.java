public class TesteOperario {
    public static void main(String[] args) {
        Operario operario1 = new Operario("João", "(61) 993355884", "Recanto das Emas", 2, 100, 5, 500, 10);
        Operario operario2 = new Operario("Maria", "(61) 988877766", "Taguatinga", 3, 1200, 7, 600, 8);

        double salarioOperario1 = operario1.calcularSalario();
        double salarioOperario2 = operario2.calcularSalario();

        System.out.println("Dados do Operário 1:");
        System.out.println("Nome: " + operario1.getNome());
        System.out.println("Telefone: " + operario1.getTelefone());
        System.out.println("Endereço: " + operario1.getEndereco());
        System.out.println("Salário: R$" + salarioOperario1);
        System.out.println();

        System.out.println("Dados do Operário 2:");
        System.out.println("Nome: " + operario2.getNome());
        System.out.println("Telefone: " + operario2.getTelefone());
        System.out.println("Endereço: " + operario2.getEndereco());
        System.out.println("Salário: R$" + salarioOperario2);
    }
}
