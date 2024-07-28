package java_basico.aula17;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //fatorial
        System.out.println("Numero: ");
        int fat = sc.nextInt();
        int fac = 1, i;

        for(i = 1; i <= fat; i++){
            fac = fac * i;
            System.out.println("I: " + i);
        }


        System.out.println("Fatorial: " + fac);

    }
}
