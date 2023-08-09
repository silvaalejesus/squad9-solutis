

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o dia do seu aniversario");
        int dia1 = scanner.nextInt();

        System.out.println("Insira o mes do seu aniversario");
        int mes1 = scanner.nextInt();

        System.out.println("Insira o dia do seu aniversario");
        int dia2 = scanner.nextInt();

        System.out.println("Insira o mes do seu aniversario");
        int mes2 = scanner.nextInt();

        if(validaData(dia1,dia2,mes1,mes2)){
            System.out.println("Datas iguais");
        }else{
            System.out.println("Datas diferentes");
        }
        scanner.close();
    }
    public static boolean validaData(int dia1, int dia2, int mes1, int mes2){
        return dia1 == dia2 && mes1 == mes2;
    }
}
