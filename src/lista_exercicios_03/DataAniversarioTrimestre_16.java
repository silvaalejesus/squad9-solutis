import utils.Input;

import java.time.LocalDate;

public class DataAniversarioTrimestre_16 {

    public static void main(String[] args) {
        int dia = Input.getIntInput("Informe o dia: ");
        int mes = Input.getIntInput("Informe o mês: ");

        String nomeMes = buscarNomeMes(mes);
        boolean dataValida = verificarDataAniversario(dia, mes);

//o 1 é para nao retornar o ano, apenas o dia e o mes
        LocalDate date = LocalDate.of(1, mes, dia);

        if (dataValida) {
            System.out.println("A data de aniversário está correta. Mês: " + nomeMes);
            getTrimestre(date);
        } else {
            System.out.println("Data de aniversário não é válida");
        }

        Input.closeScanner();
    }

    public static boolean verificarDataAniversario(int dia, int mes) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia >= 1 && dia <= 30;
        }

        if (mes == 2) {
            return dia >= 1 && dia <= 29;
        }

        return dia >= 1 && dia <= 31;
    }

    public static String buscarNomeMes(int mes) {
        String nomesMeses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return nomesMeses[mes - 1];
    }

    public static int getTrimestre(LocalDate date) {
        int monthValue = date.getMonthValue();
        int trimestre = (monthValue - 1) / 3 + 1;
        System.out.println("Você nasceu no " + trimestre + "° trimestre.");
        return trimestre;
    }
}
