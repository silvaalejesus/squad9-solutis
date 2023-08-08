/*
 * Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da
 *  despesa de um cliente.*/

package lista03;

import utils.Input;

import java.text.DecimalFormat;

public class Comissao_07 {
    public static void main(String[] args) {

        float despesaCliente = Input.getFloatInput("Informe o total da compra do Cliente");
        final float porcentagemComissao = (float) 10 / 100;
        float comissaoVenda = despesaCliente * porcentagemComissao;

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String comissaoFormatada = decimalFormat.format(comissaoVenda);

        System.out.println("Comissão do garçom: " + comissaoFormatada);

        Input.closeScanner();

    }
}
