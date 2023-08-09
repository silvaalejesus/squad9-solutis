package lista_exercicios_05;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(){
    }

    public Pessoa(String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = "(00)00000-0000";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
