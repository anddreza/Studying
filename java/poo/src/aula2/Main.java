package aula2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caneta c1  = new Caneta();
        c1.cor="Azul";
        c1.ponta = 0.5f;
        c1.tampar();

        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Preto";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}