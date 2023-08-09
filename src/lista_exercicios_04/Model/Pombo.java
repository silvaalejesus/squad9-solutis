package lista_exercicios_04.Model;

import lista_exercicios_04.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, String tipoAnimal, int idade, String habitat, float peso, float altura,
            int quantidadeAssas, int quantidadePatas, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, peso, altura, quantidadeAssas, quantidadePatas, envergaduraAssa);
    }

    @Override
    public void voar() {
        System.out.println(tipoAnimal + " está voando");
    }
}
