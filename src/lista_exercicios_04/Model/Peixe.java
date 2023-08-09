package lista_exercicios_04.Model;

import lista_exercicios_04.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, String tipoAnimal, int idade, String habitat, float peso, float altura) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
    }

    @Override
    public void nadar() {
        System.out.println(tipoAnimal + " está nadando.");
    }
}
