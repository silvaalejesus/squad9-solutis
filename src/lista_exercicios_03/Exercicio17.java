package Lista_3;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o número do mês: ");
        int mes = scanner.nextInt();

        boolean dataValida = validaData(dia, mes);

        if (dataValida) {
            String nomeMes = obterNomeMes(mes);
            System.out.println("Data de aniversário válida!");
            System.out.println("Nome do mês: " + nomeMes);
            System.out.printf(obterTrimestre(mes)+"° trimestre ");
            System.out.println(" Horoscopo: " +obterHoroscopo(dia,mes));
        } else {
            System.out.println("Data de aniversário inválida.");
        }

        scanner.close();
    }

    public static boolean validaData(int dia, int mes) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || (dia > 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
                mes == 8 || mes == 10 || mes == 12)) ||
                (dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) ||
                (dia > 29 && mes == 2)) {
            return false;
        }

        return true;
    }

    public static String obterNomeMes(int mes) {
        String[] nomesMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return nomesMeses[mes - 1];
    }
    public static int obterTrimestre(int mes){
        int trimestre = 0;
        if(mes == 1 || mes == 2 || mes == 3) return trimestre = 1;
        else if (mes == 4 || mes == 5 || mes == 6) return trimestre = 2;
        else if(mes == 7 || mes == 8 || mes == 9)return trimestre = 3;
        return trimestre = 4;

    }
    public static String obterHoroscopo(int dia, int mes){
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) return "Aries";
        if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) return "Touro";
        if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) return "Gemeos";
        if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) return "Cancer";
        if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) return "Leao";
        if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) return "Virgem";
        if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) return "Libra";
        if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) return "Escorpiao";
        if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) return "Sagitario";
        if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) return "Capricornio";
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) return "Aquario";
        return "Peixes";
    }
}
