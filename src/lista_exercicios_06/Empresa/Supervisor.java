package lista_exercicios_06.Empresa;

public class Supervisor extends Comissao {
    public Supervisor() {
        super(600);
    }

    @Override
    public double calcularComissao() {
        setValor(600);
        return getValor();
    }
}
