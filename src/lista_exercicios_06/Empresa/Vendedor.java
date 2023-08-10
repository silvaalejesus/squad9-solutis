package lista_exercicios_06.Empresa;

public class Vendedor extends Comissao{
    public Vendedor(){
        super(250);
    }

    @Override
    public double calcularComissao() {
        setValor(250);
        return getValor();
    }

}