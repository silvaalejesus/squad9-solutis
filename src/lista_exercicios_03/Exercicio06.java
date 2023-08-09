

public class Exercicio06 {
    public static void main(String[] args){
        double raio = 5;

        System.out.println("Area "+calculaArea(raio));

    }
    public static double calculaArea(double raio){
        return Math.PI*raio*raio;
    }
}
