package java_basico;

import java.util.ArrayList;
import java.util.Scanner;

//ax2 + bx + c
public class Exercicio16 {

    public static void main(String[] args) {
        // ax2 + bx + c
        // x = -b+- raiz de b2 - 4ac / 2a
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0){
            System.out.println("Não é equação do segundo grau");
        } else {
            int b = sc.nextInt();
            int c = sc.nextInt();

            double delta =  (b*b) - (4 * a * c);

            if (delta < 0){
                System.out.println("Não é uma equação ");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / 2*a;
                double x2 = (-b - Math.sqrt(delta)) / 2*a;

                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);

            }
        }
    }



}
