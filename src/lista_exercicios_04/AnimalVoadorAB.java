package lista_exercicios_04;

public abstract class AnimalVoadorAB extends AnimalAB {
    int quantidadeAssas;
    double envergaduraAssa;
    int quantidadePatas;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, float peso, float altura,
            int quantidadeAssas, int quantidadePatas, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
        this.quantidadeAssas = quantidadeAssas;
        this.quantidadePatas = quantidadePatas;
        this.envergaduraAssa = envergaduraAssa;
    }

    public int getQuantidadeAssas() {
        return quantidadeAssas;
    }

    public double getEnvergaduraAssa() {
        return envergaduraAssa;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    @Override
    public void comer() {
        System.out.println(tipoAnimal + " está comendo");
    }

    @Override
    public void moverse() {
        System.out.println(tipoAnimal + " está se movendo");
    }

    @Override
    public void dormir() {
        System.out.println(tipoAnimal + " está dormindo");
    }

    protected abstract void voar();
}
