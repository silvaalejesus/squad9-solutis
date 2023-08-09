public class CalculoGraos {
    public static void main(String[] args) {
        calcularInt();
        calcularLong();
    }

    public static void calcularInt() {
        int casa = 1;
        int graos = 1;
        boolean overflow = false;

        for (int i = 1; i <= 64; i++) {
            if (i > 1) {
                if (graos > Integer.MAX_VALUE / 2) {
                    overflow = true;
                }
                graos *= 2;
            }
            if (overflow) {
                System.out.println("Overflow de int ocorre na casa: " + casa);
                break;
            }
            casa++;
        }
    }

    public static void calcularLong() {
        int casa = 1;
        long graos = 1;
        boolean overflow = false;

        for (int i = 1; i <= 64; i++) {
            if (i > 1) {
                if (graos > Long.MAX_VALUE / 2) {
                    overflow = true;
                }
                graos *= 2;
            }
            System.out.println("Casa " + casa + ": " + graos + " grãos");
            if (overflow) {
                System.out.println("Overflow de long ocorre na casa: " + casa);
                break;
            }
            casa++;
        }
    }
}
