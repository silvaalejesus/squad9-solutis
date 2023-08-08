package lista_exercicios_03;

import java.util.Scanner;

public class PlanoVaiVai_55 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double VALOR_MENSAL = 50.00;
        final int MINUTOS_INCLUIDOS = 100;
        final int MINUTOS_ADICIONAIS_VAI_VAI = 50;
        final double VALOR_MINUTO_EXCEDENTE_OUTRAS_OPERADORAS = 0.65;
        final double VALOR_MINUTO_EXCEDENTE_VAI_VAI = 0.20;
        final double DESCONTO_TELEFONE_FIXO = 0.5;

        double saldo = VALOR_MENSAL;

        char tipoLigacao;
        do {
            System.out.print("Digite o tipo de ligação (o = outras operadoras, v = Vai-Vai, f = telefone fixo): ");
            tipoLigacao = scanner.next().charAt(0);

            if (tipoLigacao == 'o' || tipoLigacao == 'v' || tipoLigacao == 'f') {
                System.out.print("Digite a quantidade de minutos: ");
                int minutos = scanner.nextInt();

                int minutosIncluidos = MINUTOS_INCLUIDOS;
                if (tipoLigacao == 'v') {
                    minutosIncluidos += MINUTOS_ADICIONAIS_VAI_VAI;
                }

                double valorMinutoExcedente;
                if (tipoLigacao == 'v') {
                    valorMinutoExcedente = VALOR_MINUTO_EXCEDENTE_VAI_VAI;
                } else {
                    valorMinutoExcedente = VALOR_MINUTO_EXCEDENTE_OUTRAS_OPERADORAS;
                }

                if (tipoLigacao == 'f') {
                    minutosIncluidos *= DESCONTO_TELEFONE_FIXO;
                }

                double valorPagar = 0.0;
                if (minutos > minutosIncluidos) {
                    int minutosExcedentes = minutos - minutosIncluidos;
                    valorPagar = minutosExcedentes * valorMinutoExcedente;
                }

                saldo -= valorPagar;

                System.out.println("Saldo restante: " + saldo);
                System.out.println("Valor a pagar: " + valorPagar);

                System.out.print("Deseja digitar mais uma ligação? (s/n): ");
                char resposta = scanner.next().charAt(0);
                if (resposta == 'n') {
                    break;
                }
            } else {
                System.out.println("Tipo de ligação inválido. Digite novamente.");
            }
        } while (true);

        scanner.close();
    }
}
