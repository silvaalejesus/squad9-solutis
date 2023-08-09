package lista_exercicios_06;

public class TesteAnimais {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro("Princesa", 3);
        animais[1] = new Cavalo("Pé de Pano", 7);
        animais[2] = new Preguica("Soneca", 2);

        System.out.println("------------- Emitir som -------------");

        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            animal.emitirSom();
            System.out.println("--------------------------");
        }

    }
}
