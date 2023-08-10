package lista_exercicios_06.Empresa;

public class Gerente extends Comissao {
    public Gerente() {
        super(1500);
    }

    @Override
    public double calcularComissao() {
        setValor(1500);
        return getValor();
    }
}
