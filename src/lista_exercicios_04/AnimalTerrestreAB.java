package lista_exercicios_04;

public abstract class AnimalTerrestreAB extends AnimalAB {
    int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, float peso, float altura,
            int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
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
}
