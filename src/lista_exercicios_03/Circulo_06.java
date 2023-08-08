public class Circulo_06 {
    public static void main(String[] args) {
        double raio = 5.0;
        double area = calcularAreaDoCirculo(raio);

        System.out.println("Área do círculo com raio " + raio + " metros é: " + area + " metros quadrados");
    }

    public static double calcularAreaDoCirculo(double raio) {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
