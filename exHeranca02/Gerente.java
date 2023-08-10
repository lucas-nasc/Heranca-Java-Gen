package exHeranca02;

public class Gerente extends Funcionario1{
    private int comissao;

    public Gerente(String nome, int idade, int salario, String cargo, int comissao) {
        super(nome, idade, salario, cargo);
        this.comissao = comissao;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public void salarioTotal(){
        double valorTotal = (getSalario()*comissao)/100;
        System.out.println("O valor da comissão é" + valorTotal);
        double salarioTotal = getSalario()+valorTotal;
        System.out.println("Salario Total: " + salarioTotal);

    }

    public void visualizar(){
        System.out.println("\nGerente: " + getNome() + "\nIdade: " + getIdade() + "\nSalario: " + getSalario() + "\nPorcentagem da Comissão: " + comissao);
    }

}
