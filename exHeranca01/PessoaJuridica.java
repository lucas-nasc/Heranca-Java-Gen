package exHeranca01;

public class PessoaJuridica extends Cliente{
    private String cnpj;

    public PessoaJuridica(String nome, int idade, int telefone, String profissão, String cnpj) {
        super(nome, idade, telefone, profissão);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void validaCnpj(){
        if (getCnpj().length() != 14){
            System.out.println("CNPJ Inválido");
        }else {
            System.out.println("CNPJ Válido");
        }
    }

    public void visualizar(){
        System.out.println("Empresa: " + getNome() + "\nTelefone: " + getTelefone() + "\nTipo de empresa: " + getProfissão() + "\nCNPJ: " + getCnpj());
    }

}
