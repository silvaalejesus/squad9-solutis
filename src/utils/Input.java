package utils;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);
//utilizei static nos metodos pq quero reutilar isso para entradas do usuario, assim consigo utilizar sem criar objetos da classe Input
    public static int getIntInput(String prompt) {
//        exibe uma mensagem do que é para ser digitado pelo usuario
        System.out.println(prompt);
//        ler e guarda a entrada do usuario
        int value = scanner.nextInt();
        clearBuffer();
        return value;
    }

    public static float getFloatInput(String prompt) {
        System.out.println(prompt);
        float value = scanner.nextFloat();
        clearBuffer();
        return value;
    }

    public static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        double value = scanner.nextDouble();
        clearBuffer();
        return value;
    }

    public static String getStringInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

//    após ler um valor não alfanumérico (números, por exemplo), onde o valor é
//    armazenado na variável, mas o ENTER continua no buffer.
//    Você precisa verificar se esse ENTER está presente e removê-lo.
    private static void clearBuffer() {
        if (Input.scanner.hasNextLine()) {
            Input.scanner.nextLine();
        }
    }

    public static void closeScanner() {
        scanner.close();
    }
}
