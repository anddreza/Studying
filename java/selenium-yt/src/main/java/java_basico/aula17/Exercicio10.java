package java_basico.aula17;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. inserir numeros
        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = 0;

        for (int i = a; i <= b; i++){
            System.out.println(i);
            soma += i;
        }
        System.out.print("Soma: " + soma);
    }

}
