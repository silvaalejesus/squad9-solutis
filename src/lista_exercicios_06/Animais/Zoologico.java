package lista_exercicios_06;

public class Zoologico {
    public static void main(String[] args) {
        Animal[] jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Princesa", 3);
        jaulas[1] = new Cavalo("Pangaré", 9);
        jaulas[2] = new Preguica("Sid", 11);
        jaulas[3] = new Cachorro("Max", 5);
        jaulas[4] = new Cavalo("Ventania", 2);
        jaulas[5] = new Preguica("Baby", 1);
        jaulas[6] = new Cachorro("Trovão", 4);
        jaulas[7] = new Cavalo("Rapidinho", 4);
        jaulas[8] = new Preguica("Zangado", 5);
        jaulas[9] = new Cachorro("Rex", 3);

        System.out.println("------------- Animais na Jaula -------------");

        for (Animal animal : jaulas) {
            System.out.println("O animal " + animal.getNome() + " está na jaula.");
            System.out.println("E tem " + animal.getIdade() + " anos de idade.");
            animal.emitirSom();
            if(animal instanceof Cachorro || animal instanceof Cavalo)
                animal.movimentar();
            System.out.println("-------------------------------------");
        }
    }
}
