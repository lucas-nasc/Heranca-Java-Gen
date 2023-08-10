package exHeranca05;

public class Vip extends Ingresso {
    private String beneficio;

    public Vip(String nome, float preco, String tipo, String beneficio) {
        super(nome, preco, tipo);
        this.beneficio = beneficio;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public void visualiza(){
        System.out.println("Nome: " + getNome() + "\nPreço: " + getPreco() + "\nBenefecio: " + beneficio);
    }
}
