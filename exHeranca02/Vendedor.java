package exHeranca02;

public class Vendedor extends Funcionario1{

    private int Vendas;

    public Vendedor(String nome, int idade, int salario, String cargo, int vendas) {
        super(nome, idade, salario, cargo);
        Vendas = vendas;
    }

    public int getVendas() {
        return Vendas;
    }

    public void setVendas(int vendas) {
        Vendas = vendas;
    }

    public void visualiza(){
        System.out.println("Vendedor: " + getNome() + "\nIdade: " + getIdade() + "\nSalario: " + getSalario() + "\nCargo: " + getCargo() + "\nNumero de vendas do mes:" + Vendas);
    }
}
