package exHeranca04;

public class Perfumaria extends Farmacia{

    private String nomePerfume;
    private String sexo;

    public Perfumaria(String nomeFarmacia, String produto, String nomePerfume, String sexo) {
        super(nomeFarmacia, produto);
        this.nomePerfume = nomePerfume;
        this.sexo = sexo;
    }

    public String getNomePerfume() {
        return nomePerfume;
    }

    public void setNomePerfume(String nomePerfume) {
        this.nomePerfume = nomePerfume;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void visualiza(){
        System.out.println("Estabelecimento: " + getNomeFarmacia() + "\nTipo do produto: " + getProduto() + "\nNome do perfume: " + nomePerfume + "\nTipo do perfume: " + sexo);
    }
}
