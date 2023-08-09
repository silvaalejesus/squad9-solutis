
import java.util.ArrayList;
import java.util.Random;

public class Sorteio_34 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

//        gera os numeros aleatorios e adiciona no array
        while (numeros.size() < 100) {
            int numero = random.nextInt(100);
//            verifica se o numero nao é repetido
            if (!numeros.contains(numero)) {
                numeros.add(numero);
            }
        }

//exibe apenas 50 numeros
        int contador = 0;
        for (int numero : numeros) {
            System.out.println(numero);
            contador++;
            if (contador >= 50) break;
        }
    }
}
