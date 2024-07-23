package java_basico.aula17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(a + " ! = ");
        int soma = 1;
        for (int i = a; i > 0 ; i--){
            soma *= i;
            System.out.println("A sequencia é: " + i);
        }
        System.out.println("O fatorial: " + soma);
    }
}
