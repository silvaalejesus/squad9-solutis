package lista_exercicios_06;

public class Cachorro extends Animal {
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro " + this.getNome() + " um som: Au Au Au");
	}
	
	@Override
	public void movimentar() {
		System.out.println("O cachorro " + this.getNome() + " vai correr");
	}
}
