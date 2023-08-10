package exHeranca04;

public class TesteFarmacia {
    public static void main(String[] args) {

        Medicamento[] remedio = new Medicamento[2];
        remedio[0] = new Medicamento("Farmacia do Zé","Remedio","Dipirona",500);
        remedio[1] = new Medicamento("Farmacia Zé da Grota","Remedio","Loratadina",10);

        for (Medicamento listar:remedio) {
            listar.visualizar();
            System.out.println("\n");
        }

        Perfumaria[] perfume = new Perfumaria[2];
        perfume[0] = new Perfumaria("Farmacia da esquina","Perfuma","Malbec","masculino");
        perfume[1] = new Perfumaria("Farmacia da Virginia","Perfume","Carolina Herrera","Feminino");

        for (Perfumaria listando:perfume) {
            listando.visualiza();
            System.out.println("\n");

        }


    }

}
