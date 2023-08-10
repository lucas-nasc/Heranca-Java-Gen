package Poo;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado1 wanessa = new Empregado1("Wanessa Melo","Rua da marola,33","1234567890",1125243372,22,01,28000,15);
        wanessa.imprimirInfo();
        wanessa.calcularSalario();
    }
}
