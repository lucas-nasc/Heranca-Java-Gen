package exHeranca06;

public class TesteCurso {
    public static void main(String[] args) {

        Especializacao[] curso = new Especializacao[2];
        curso[0] = new Especializacao("Tecnologia da informação",2000,"Tecnico");
        curso[1] = new Especializacao("Educação Fisica",5000,"Bacharelado");

        for (Especializacao listar:curso) {
            listar.visualiza();
            System.out.println("\n");

        }

        CursoLivre[] curso1 = new CursoLivre[2];
        curso1[0] = new CursoLivre("Generation Programador FullStack",540,"Ifood");
        curso1[1] = new CursoLivre("Generation Programador .NET",540,"Ifood");

        for (CursoLivre listando:curso1) {
            listando.visualiza();
            System.out.println("\n");
        }

    }
}
