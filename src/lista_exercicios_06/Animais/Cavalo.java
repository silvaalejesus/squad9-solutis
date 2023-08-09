package lista_exercicios_06;

public class Cavalo extends Animal {
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cavalo " + this.getNome() + " faz um som: Hiin in in");
	}
	
	@Override
	public void movimentar() {
		System.out.println("O cavalo " + this.getNome() + " vai correr");
	}
}
