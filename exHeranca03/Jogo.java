package exHeranca03;

public class Jogo  extends Produto{

    private String tipo;

    public Jogo(String nome, float preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void visualisar(){
        System.out.println("Nome: " + getNome() + "\nPreço: " + getPreco() + "\nTipo: " + tipo);

    }
}
