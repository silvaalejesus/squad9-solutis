package lista_exercicios_05.testes;

import lista_exercicios_05.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Paulo", "(77) 981562351", "Rua Paulo", 21, 15000, 17.2);

        System.out.println("---------- Empregado ----------");

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Código do setor: " + empregado.getCodigoSetor());
        System.out.println("Salário base: R$ "+ empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto());
        System.out.println("Salário: R$ " + empregado.calcularSalario());

        System.out.println("--------------------------------");
    }
}
