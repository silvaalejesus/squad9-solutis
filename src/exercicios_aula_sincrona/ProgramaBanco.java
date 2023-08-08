class Cliente {
    String cpf;
    String nome;
    String endereco;
    String anoNascimento;
    
    public Cliente(String cpf, String nome, String endereco, String anoNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.anoNascimento = anoNascimento;
    }
}

class ContaCorrente {
    String numero;
    String tipo;
    Cliente primeiroTitular;
    Cliente segundoTitular;
    double saldo;
    double limiteTotal;

    public ContaCorrente(String numero, String tipo, Cliente primeiroTitular, Cliente segundoTitular, double saldo, double limiteTotal) {
        this.numero = numero;
        this.tipo = tipo;
        this.primeiroTitular = primeiroTitular;
        this.segundoTitular = segundoTitular;
        this.saldo = saldo;
        this.limiteTotal = limiteTotal;
    }

    public void credito(double valor) {
        saldo += valor;
    }

    public void debito(double valor) {
        saldo -= valor;
    }

    public void resumo() {
        System.out.println("Numero da Conta Corrente: " + numero);
        System.out.println("Nome do primeiro titular: " + primeiroTitular.nome);
        
        if (segundoTitular != null) {
            System.out.println("Nome do segundo titular: " + segundoTitular.nome);
        }
        
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("Limite Atual: " + (limiteTotal + saldo));
        System.out.println("Limite Total: " + limiteTotal);
        
        if (estaDevedor()) {
            System.out.println("Procure o seu gerente!");
        }
    }

    public boolean estaDevedor() {
        return saldo < 0;
    }
}

public class ProgramaBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("111.111.111-11", "Duque", "Rua A", "2004");
        Cliente cliente2 = new Cliente("222.222.222-22", "João", "Rua B", "2005");
        
        ContaCorrente conta = new ContaCorrente("1234-5", "Conta Corrente", cliente1, cliente2, 100.0, 400.0);
        
        conta.credito(200.0);
        conta.debito(100.0);
        
        conta.resumo();
    }
}
