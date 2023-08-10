package exHeranca03;

public class Console extends Produto{

    private String fabricante;

    public Console(String nome, float preco, String fabricante) {
        super(nome, preco);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void visualizar(){
        System.out.println("Nome: " + getNome() + "\nPreco: " + getPreco() + "\nFabricante: " + fabricante);
    }
}
