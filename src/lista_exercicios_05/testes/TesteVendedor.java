package src.lista_exercicios_05.testes;

public class TesteVendedor {
    public static void main(String[] args) {
        lista_exercicios_05.Vendedor vendedor1 = new lista_exercicios_05.Vendedor("João", "123-456", "Rua A", 1, 2000, 5, 50000, 5);
        lista_exercicios_05.Vendedor vendedor2 = new lista_exercicios_05.Vendedor("Maria", "789-012", "Rua B", 2, 1800, 3.5, 75000, 3.5);

        System.out.println("Salário do Vendedor 1: "+ vendedor1.calcularSalario());
        System.out.println("Salário do Vendedor 2: "+ vendedor2.calcularSalario());
    }
}
