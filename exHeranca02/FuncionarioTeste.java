package exHeranca02;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Gerente[] gerente = new Gerente[2];

        gerente[0] = new Gerente("Gabreil",22,2000,"Gerente",5);
        gerente[1] = new Gerente("Lucas",48,1500,"Gerente",10);

        for (Gerente listar:gerente) {
            listar.visualizar();
            listar.salarioTotal();
        }
        Vendedor vendedor =new Vendedor("Lucas Nascimento",45,1000,"Vendedor",8);
        Vendedor vendedor1 = new Vendedor("José da Silva",18,1050,"Vendedor",22);

        System.out.println("\n");
        vendedor.visualiza();
        System.out.println("\n");
        vendedor1.visualiza();


    }
}
