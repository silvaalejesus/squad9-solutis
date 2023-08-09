import utils.Input;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data_57 {

    public static void main(String[] args) {
        int dia1 = Input.getIntInput("Informe a primeira data (dia):");
        int mes1 = Input.getIntInput("Informe a primeira data (mês):");
        int ano1 = Input.getIntInput("Informe a primeira data (ano):");

        int dia2 = Input.getIntInput("Informe a segunda data (dia):");
        int mes2 = Input.getIntInput("Informe a segunda data (mês):");
        int ano2 = Input.getIntInput("Informe a segunda data (ano):");

//        cria o objeto com as datas informadas
        Calendar calendario1 = Calendar.getInstance();
        calendario1.set(ano1, mes1 - 1, dia1);

        Calendar calendario2 = Calendar.getInstance();
        calendario2.set(ano2, mes2 - 1, dia2);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Garantir que calendario1 seja a data mais antiga
        if (calendario1.after(calendario2)) {
            Calendar temp = calendario1;
            calendario1 = calendario2;
            calendario2 = temp;
        }

        while (!calendario1.after(calendario2)) {
            Date currentDate = calendario1.getTime();
            System.out.println(dateFormat.format(currentDate));
            calendario1.add(Calendar.DATE, 1); // Avançar para o próximo dia
        }

        Input.closeScanner();
    }
}
