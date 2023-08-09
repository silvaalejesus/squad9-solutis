package Lista_3;

import java.util.Scanner;

public class Exercicio26 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro horário (hh:mm:ss):");
            String horario1 = scanner.nextLine();

            System.out.println("Digite o segundo horário (hh:mm:ss):");
            String horario2 = scanner.nextLine();

            scanner.close();

            int segundosHorario1 = calcularSegundos(horario1);
            int segundosHorario2 = calcularSegundos(horario2);

            int diferencaSegundos = Math.abs(segundosHorario1 - segundosHorario2);

            System.out.println("Diferença entre os horários em segundos: " + diferencaSegundos + " segundos");
        }

        public static int calcularSegundos(String horario) {
            String[] partes = horario.split(":");
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);
            int segundos = Integer.parseInt(partes[2]);

            return horas * 3600 + minutos * 60 + segundos;
        }

}
