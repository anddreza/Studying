package java_intermediario;

public class Teste {
    public static void main(String[] args) {

        usandoConstantes();
    }

    private static void usandoConstantes(){
        int segunda = Aula53.SEGUNDA;
        int terca = Aula53.TERCA;
        int quarta = Aula53.QUARTA;
        int quinta = Aula53.QUINTA;
        int sexta = Aula53.SEXTA;
        int sabado = Aula53.SABADO;
        int domingo = Aula53.DOMINGO;

        System.out.println("Teste utilizando constantes no Java");
        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);








    }

    private static void imprimeDiaSemana(int dia){
        switch (dia){
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
}
