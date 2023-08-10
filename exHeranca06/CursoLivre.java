package exHeranca06;

public class CursoLivre extends Curso {

    private String patrocinador;

    public CursoLivre(String nome, int cargaHoraria, String patrocinador) {
        super(nome, cargaHoraria);
        this.patrocinador = patrocinador;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public void visualiza(){
        System.out.println("\nNome do curso: " + getNome() + "\nCarga Horaria: " + getCargaHoraria() + "\nPatrocinado: " + patrocinador);
    }
}
