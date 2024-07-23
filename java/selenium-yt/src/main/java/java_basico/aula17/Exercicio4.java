package java_basico.aula17;

public class Exercicio4 {
    public static void main(String[] args) {
        int a = 80000;
        int b = 200000;
        int cont = 0;

        boolean ultra = false;

        while(a < b){
            a += (a/100) * 3;
            b += (b/100) * 1.5;
            cont++;
        }

        System.out.println("Pop A: " + a);
        System.out.println("Pop B: " + b);
        System.out.println("Quantidade de anos: " + cont);


    }
}
