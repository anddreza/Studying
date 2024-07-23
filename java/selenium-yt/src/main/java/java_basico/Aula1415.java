package java_basico;

import java.util.Scanner;

public class Aula1415 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero ");
        int a = scanner.nextInt();

        System.out.println("Insira o segundo numero ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("O maior numero é o PRIMEIRO: " + a);
        } else if (b > a) {
            System.out.println("O maior numero é o SEGUNDO: " + b);
        }
        scanner.close();

    }
}
