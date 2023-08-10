package exHeranca01;

public class ClienteTeste {
    public static void main(String[] args) {
        PessoaFisica[] client1 = new PessoaFisica[2];

        client1[0] = new PessoaFisica("Lucas Nascimento",22,1236147899,"Desenvolvedor Back-end","1234567890");
        client1[1] = new PessoaFisica("Lohan Nascimento",18,1254369788,"Desenvolvedor Web Jr","48521463987");

        for (PessoaFisica listar:client1) {
            System.out.println("\n");
            listar.visualizar();
            listar.validaCpf();
        }
        PessoaJuridica[] client2 = new PessoaJuridica[2];
        client2[0]= new PessoaJuridica("Farmacia do seu zé",1,1125243842,"Farmacia","1425367485154");
        client2[1] = new PessoaJuridica("Lan house Team",8,1715263482,"Tecnologia","25161257851452");

        for (PessoaJuridica listando:client2){
            System.out.println("\n");
            listando.visualizar();
            listando.validaCnpj();
        }


    }
}
