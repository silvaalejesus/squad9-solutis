package lista_exercicios_06;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double renda = 1000;
    private double rendaTotal;
    private String escolaridade;

    public Funcionario(String nome, int codigoFuncional, double renda, double rendaTotal, String escolaridade) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.renda = renda;
        this.rendaTotal = rendaTotal;
        this.escolaridade = escolaridade;
    }

    public double calcularRendaTotal(){
        double rendaBasica = 0, rendaMedia = 0, rendaSuperior = 0;

        if (escolaridade.equalsIgnoreCase("basico")) {
            rendaBasica = renda * 1.10;
            return rendaBasica;
        } else if (escolaridade.equalsIgnoreCase("medio")) {
            rendaMedia = rendaBasica * 1.50;
            return rendaMedia;
        } else if (escolaridade.equalsIgnoreCase("superior")) {
            rendaSuperior = rendaMedia * 2.00;
            return rendaSuperior;
        } else {
            return renda;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    public double getRendaTotal() {
        return rendaTotal;
    }

    public void setRendaTotal(double rendaTotal) {
        this.rendaTotal = rendaTotal;
    }
    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
}
