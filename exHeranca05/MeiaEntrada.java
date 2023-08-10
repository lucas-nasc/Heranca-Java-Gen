package exHeranca05;

public class MeiaEntrada extends Ingresso {

    private String comprovante;


    public MeiaEntrada(String nome, float preco, String tipo, String comprovante) {
        super(nome, preco, tipo);
        this.comprovante = comprovante;
    }

    public String getComprovante() {
        return comprovante;
    }

    public void setComprovante(String comprovante) {
        this.comprovante = comprovante;
    }

    public void visualiza(){
        System.out.println("Nome: " + getNome() + "\nTipo: " + getTipo() + "\nComprovante: " + comprovante);
    }
}
