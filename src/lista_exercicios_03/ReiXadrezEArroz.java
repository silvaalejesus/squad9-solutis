public class ReiXadrezEArroz {
    public static void main(String[] args) {
        long soma = 0;
        long graosPorCasa = 1;

        for (int i = 0; i <= 64; i++) {
            soma += graosPorCasa;
            graosPorCasa *= 2;
        }


        System.out.println("A soma de todos os (Sem contar o overflow do long) grãos é: " + soma);
        System.out.println("A quantidade de sacos de arroz é (Considerando um caso de arroz com 50.000): " + soma / 50000);
    }
}