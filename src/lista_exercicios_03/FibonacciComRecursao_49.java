package lista_exercicios_03;
//Apesar de ser um codigo mais limpo, a recursão aumenta o tempo de complexidade do codigo
public class FibonacciComRecursao_49 {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }
}
