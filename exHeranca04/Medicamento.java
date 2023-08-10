package exHeranca04;

public class Medicamento extends Farmacia{

    private String nomeMedicamento;
    private float dosagem;

    public Medicamento(String nomeFarmacia, String produto, String nomeMedicamento, float dosagem) {
        super(nomeFarmacia, produto);
        this.nomeMedicamento = nomeMedicamento;
        this.dosagem = dosagem;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public float getDosagem() {
        return dosagem;
    }

    public void setDosagem(float dosagem) {
        this.dosagem = dosagem;
    }

    public void visualizar(){
        System.out.println("Estabelecimento: " + getNomeFarmacia()+ "\nTipo do produto: " + getProduto() + "\nRemedio: "+ nomeMedicamento + "\nDosagem: " + dosagem + "ML" );
    }

}
