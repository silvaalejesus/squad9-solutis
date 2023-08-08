import java.util.Scanner;
import java.time.LocalDate;

public class Signo_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Informe o mês de nascimento: ");
        int mes = scanner.nextInt();

        String nomeMes = buscarNomeMes(mes);
        boolean dataValida = verificarDataAniversario(dia, mes);

        LocalDate date = LocalDate.of(1, mes, dia);

        if (dataValida) {
            System.out.println("A data de aniversário está correta. Mês: " + nomeMes);
            getTrimestre(date);
            getSigno(dia, mes);
        } else {
            System.out.println("Data de aniversário não é válida");
        }

        scanner.close();
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

    public static void getSigno(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Seu signo é Áries.");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Seu signo é Touro.");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Seu signo é Gêmeos.");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Seu signo é Câncer.");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Seu signo é Leão.");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Seu signo é Virgem.");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Seu signo é Libra.");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Seu signo é Escorpião.");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Seu signo é Sagitário.");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Seu signo é Capricórnio.");
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Seu signo é Aquário.");
        } else {
            System.out.println("Seu signo é Peixes.");
        }
    }
}
