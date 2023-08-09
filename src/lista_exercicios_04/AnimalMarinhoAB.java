package lista_exercicios_04;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, float peso, float altura) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
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

    protected abstract void nadar();
}
