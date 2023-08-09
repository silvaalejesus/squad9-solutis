package Lista_3;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int numero = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = scanner.nextInt();

        retornaQtdImpar(numero, numero2);
    }

    public static void retornaQtdImpar(int num1, int num2){

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for(int i = num1; i <= num2; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
