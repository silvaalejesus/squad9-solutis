

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio42 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 40; i++) {
            ArrayList<Integer> grupo = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int numero = random.nextInt(60);
                grupo.add(numero);
            }

            Collections.sort(grupo);

            System.out.println("Grupo " + (i + 1) + ": " + grupo);
        }
    }
}
