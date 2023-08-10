package exHeranca03;

public class TesteGame {
    public static void main(String[] args) {

        Jogo[] jogo = new Jogo[2];

        jogo[0] = new Jogo("Uncharted 4",150,"Aventura");
        jogo[1] = new Jogo("UFC",200,"Luta");

        for (Jogo listar:jogo) {
            listar.visualisar();
            System.out.println("\n");
        }

        Console console = new Console("Playstation 5",5000,"Sony");
        Console console1 = new Console("Xbox One",4000,"Microsoft");

        console.visualizar();
        System.out.println("\n");
        console1.visualizar();



    }
}
