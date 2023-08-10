package exHeranca04;

public class Farmacia {

    private String nomeFarmacia;
    private String produto;


    public Farmacia(String nomeFarmacia, String produto) {
        this.nomeFarmacia = nomeFarmacia;
        this.produto = produto;
    }

    public String getNomeFarmacia() {
        return nomeFarmacia;
    }

    public void setNomeFarmacia(String nomeFarmacia) {
        this.nomeFarmacia = nomeFarmacia;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
