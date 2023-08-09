package Lista_3;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        if(media >= 7 ){
            System.out.printf("Aprovado " +media);

        }else if(media >= 5 && media <=7 ){
            System.out.println("Recuperacao " +media);

        }else{
            System.out.println("voce foi para recuperacao final");
            System.out.println("Insira a nota");
            double notaRec = scanner.nextDouble();

            if(notaRec>=5){
                System.out.println("Aprovado pela recuperação final");
            }else{
                System.out.println("Reprovado pela recuperação final");
            }

        }

    }

}
