
public class Fibonacci_49 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int temp;

        for (int i = 0; i < 50; i++) {
            temp = a;
            a = a + b;
            b = temp;
            System.out.println(b);
        }
    }
}
