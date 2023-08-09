package lista_exercicios_06;

public class Veterinario {
    private String nome;

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public void examinar(Animal animal) {
        System.out.println("O veterinário " + this.nome + " está examinando o animal " + animal.getNome() + "...");
        animal.emitirSom();
        System.out.println("O animal " + animal.getNome() + " foi examinado com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }
}
