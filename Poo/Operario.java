package Poo;

public class Operario extends Pessoa{
    private double valorProdução;
    private double comissao;

    public Operario(String nome, String endereco, String cpf, int telefone, int idade, double valorProdução, double comissao) {
        super(nome, endereco, cpf, telefone, idade);
        this.valorProdução = valorProdução;
        this.comissao = comissao;
    }

    public double getValorProdução() {
        return valorProdução;
    }

    public void setValorProdução(double valorProdução) {
        this.valorProdução = valorProdução;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public  void imprimirInfo(){
        System.out.println("\nNome do empregado: " + getNome() + " \nEndereço do Empregado: " + getEndereco() + "\nCPF: " + getCpf() +
                "\nIdade: " + getIdade() + "\nTelefone: " +getTelefone() + "\nValor monetário total dos artigos produzidos: " + valorProdução
        + "\nPorcentagem (sem%) da comissão deste artigo: " + comissao) ;
    }

    public void calcularValorArtigo(){
        double valorTotal = valorProdução + (valorProdução*(comissao/100));
        System.out.println("o valor da comissão de " +getNome() + " é " + valorTotal);
    }



}
