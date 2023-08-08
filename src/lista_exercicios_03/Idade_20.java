package lista_exercicios_03;

import utils.Input;

public class Idade_20 {
    public static void main(String[] args) {
        String nome1 = Input.getStringInput("Digite o nome da primeira pessoa: ");
        int idade1 = Input.getIntInput("Digite a idade da primeira pessoa: ");

        String nome2 = Input.getStringInput("Digite o nome da segunda pessoa: ");
        int idade2 = Input.getIntInput("Digite a idade da segunda pessoa: ");

        String pessoaMaisVelha, pessoaMaisNova;

        if (idade1 > idade2) {
            pessoaMaisVelha = nome1;
            pessoaMaisNova = nome2;
        } else {
            pessoaMaisVelha = nome2;
            pessoaMaisNova = nome1;
        }

        System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
        System.out.println("Pessoa mais nova: " + pessoaMaisNova);

        Input.closeScanner();
    }
}

