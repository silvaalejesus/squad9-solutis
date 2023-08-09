import utils.Input;

public class MediaAritmeticaUsuario_44 {
    public static void main(String[] args) {
        int quantidadeValores = Input.getIntInput("Informe a quantidade para realizar a media aritmetica:");
        int soma = 0;

        System.out.println("Digite " + quantidadeValores + " valores:");

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = Input.getIntInput("");
            soma += valor;
        }

        double media = (double) soma / quantidadeValores;

        System.out.println("A média dos valores é: " + media);

        Input.closeScanner();
    }
}
