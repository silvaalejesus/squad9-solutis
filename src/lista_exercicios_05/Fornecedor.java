public class Fornecedor extends Pessoa {
	private double valorCreditado;
	private double valorDivida;
	
	public Fornecedor(String nome, String telefone, String endereco, double valorCreditado, double valorDivida) {
		super(nome, telefone, endereco);
		this.setValorCreditado(valorCreditado);
		this.setValorDivida(valorDivida);
	}
	
	public double obterSaldo() {
		return this.getValorCreditado() - this.getValorDivida();
	}
	
	
	public double getValorCreditado() {
		return valorCreditado;
	}

	public void setValorCreditado(double valorCreditado) {
		this.valorCreditado = valorCreditado;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
}
