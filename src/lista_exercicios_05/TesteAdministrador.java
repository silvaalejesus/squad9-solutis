public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador adm = new Administrador("Pedro Gentil", "(77) 981233551", "Rua Gentil", 54, 25600, 13, 362);
        
        System.out.println("---------- Administrador ----------");

        System.out.println("Nome: " + adm.getNome());
        System.out.println("Telefone: " + adm.getTelefone());
        System.out.println("Endereço: " + adm.getEndereco());
        System.out.println("Código do setor: " + adm.getCodigoSetor());
        System.out.println("Salário base: R$ " + adm.getSalarioBase());
        System.out.println("Imposto: " + adm.getImposto());
        System.out.println("Salário: R$ " + adm.calcularSalario());
        System.out.println("Ajuda de custo: R$ " + adm.getAjudaDeCusto());

        System.out.println("--------------------------------");
    }
}
