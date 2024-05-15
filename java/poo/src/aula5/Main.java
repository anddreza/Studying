package aula5;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumConta(11111);
        c1.setDono("Ju");
       // c1.estadoAtual();
        c1.abrirConta("CC");

        Conta c2 = new Conta();
        c2.setNumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("CP");


        c1.depositar(100);
        c2.depositar(500);

        c1.estadoAtual();
        c2.estadoAtual();

    }
}
