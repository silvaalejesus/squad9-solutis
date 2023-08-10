package lista_exercicios_06;

public class Preguica extends Animal {
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("A preguiça " + this.getNome() + " faz um som: Ah");
	}

	@Override
	public void movimentar() {
		System.out.println("A preguiça " + this.getNome() + " vai subir em árvores");
	}
}
