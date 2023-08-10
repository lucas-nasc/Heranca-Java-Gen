package exHeranca01;

public class Cliente {

    private String nome;
    private int idade;
    private int telefone;
    private String profissão;


    public Cliente(String nome, int idade, int telefone, String profissão) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.profissão = profissão;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }


}
