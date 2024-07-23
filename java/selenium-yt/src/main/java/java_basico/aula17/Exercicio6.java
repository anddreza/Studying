package java_basico.aula17;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double media = 0;
        int soma = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Escreva um numero: ");
            num = sc.nextInt();
            soma += num;

        }

        media = soma / 5;

        System.out.println("A soma dos numeros: " + soma);
        System.out.println("A media dos numeros: " + media);
    }
}
