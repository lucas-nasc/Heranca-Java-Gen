package exHeranca05;

public class TesteIngresso {
    public static void main(String[] args) {

        MeiaEntrada[] ingresso = new MeiaEntrada[2];
        ingresso[0] = new MeiaEntrada("Show Matue",150,"Trap","Comprovar que é estudante");
        ingresso[1] = new MeiaEntrada("Velozes e Furioso",25,"ação","Comprovar que é estudante");

        for (MeiaEntrada listar:ingresso) {
            listar.visualiza();
            System.out.println("\n");
        }

        Vip[] ingresso1 = new Vip[2];
        ingresso1[0] = new Vip("Show do Chorão",200,"rap","Camarote");
        ingresso1[1] = new Vip("Show Racionais",150,"Rap","Camarote");

        for (Vip listando:ingresso1) {
            listando.visualiza();
            System.out.println("\n");

        }


    }
}
