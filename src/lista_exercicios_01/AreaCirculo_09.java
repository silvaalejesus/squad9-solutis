import java.util.Scanner;

/*
* 9. Escreva uma classe para calcular a área de um círculo, sabendo que a área
* é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado
* terá que ser arredondado.
 * */
public class AreaCirculo_09 {
    public static void main(String[] args) {

        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o raio");
        double raio = scanner.nextDouble();
        double area = PI*Math.pow(raio, 2);

        System.out.printf("%.0f", Math.ceil(area));

        scanner.close();
    }
}
