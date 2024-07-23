package java_basico;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if ((a%400 == 0) || (a%4==0 && a%100 != 0)){
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }

     }
}
