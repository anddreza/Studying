package java_basico.aula17;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com n-ésimo termo da série de Fibonacci");
        int n = sc.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);
        //1,1,2,3,5
        for (int i = 3; i <= n; i++){

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }



    }
}
