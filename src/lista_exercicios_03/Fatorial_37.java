package lista_exercicios_03;

import utils.Input;

public class Fatorial_37 {
    public static void main(String[] args) {
        int num = Input.getIntInput("Informe um número para calcular seu fatorial");
        int resultado = fatorial(num);
        System.out.println("O fatorial do número " + num + " é " + resultado);
    }

    static int fatorial(int numero) {
        return numero < 0 ? -1 : (numero == 0) ? 1 : numero * fatorial(numero - 1);
    }
}
