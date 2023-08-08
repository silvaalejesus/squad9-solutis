import java.util.Scanner;

public class ContadorCaracteres_10 {
    private static final String VOGAIS = "aeiou";

    public static void main(String[] args) {
        // Exercício 10
        System.out.println(
                "10. Escreva uma classe que conte a quantidade de vogais, espaços em brancos e consoantes de uma cadeia de caracteres.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String str = sc.nextLine();
        sc.close();

        contarCaracteres(str);
    }

    public static void contarCaracteres(String str) {
        int vogais = 0, espacos = 0, consoantes = 0;

        // Converte a string para minúscula para facilitar a comparação
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Verifica se o caractere é uma vogal utilizando o atributo VOGAIS
            if (VOGAIS.indexOf(ch) != -1) {
                vogais++;
            }
            // Verifica se o caractere é um espaço em branco
            else if (ch == ' ') {
                espacos++;
            }
            // Verifica se o caractere é uma consoante
            else if ((ch >= 'a' && ch <= 'z')) {
                consoantes++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de espaços em branco: " + espacos);
        System.out.println("Quantidade de consoantes: " + consoantes);
    }
}
