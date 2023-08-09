package lista_exercicios_04;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected float idade;
    protected String habitat;
    protected float peso;
    protected float altura;

    public AnimalAB(String nome, String tipoAnimal, float idade, String habitat, float peso, float altura) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.peso = peso;
        this.altura = altura;
    }

    public abstract void comer();

    public abstract void moverse();

    public abstract void dormir();
}
