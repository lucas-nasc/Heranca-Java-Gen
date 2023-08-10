package exHeranca01;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, int idade, int telefone, String profissão, String cpf) {
        super(nome, idade, telefone, profissão);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void validaCpf(){
        if (getCpf().length()!=11){
            System.out.println("Cpf inválido");
        }else {
            System.out.println("Cpf válido");
        }
    }

    public void visualizar(){
        System.out.println("Cliente: " +getNome() + "\nIdade: " + getIdade() + "\nTelefone:" + getTelefone() + "\nProfissão: " + getProfissão() + "\nCpf: " + getCpf());
    }

}
