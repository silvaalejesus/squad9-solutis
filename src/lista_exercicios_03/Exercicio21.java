

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu salario?");
        double salario = scanner.nextDouble();

        System.out.println("Qual seu cargo?");
        scanner.nextLine();
        String cargo = scanner.nextLine();

        switch(cargo.toLowerCase()){
            case "diretoria" :
                System.out.println("Seu emprestimo maximo é de " + salario*0.30);
                break;
            case "gerencia" :
                System.out.println("Seu emprestimo maximo é de " + salario*0.25);
                break;
            case "operacional" :
                System.out.println("Seu emprestimo maximo é de " + salario*0.20);
                break;
        }
        scanner.close();

    }
}
