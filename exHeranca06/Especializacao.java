package exHeranca06;

public class Especializacao extends Curso{
    private String certificado;

    public Especializacao(String nome, int cargaHoraria, String certificado) {
        super(nome, cargaHoraria);
        this.certificado = certificado;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public void visualiza(){
        System.out.println("Nome do curso: " + getNome() + "\nCarga Horaria: " + getCargaHoraria() + "\nCertificação: " + certificado );
    }
}
