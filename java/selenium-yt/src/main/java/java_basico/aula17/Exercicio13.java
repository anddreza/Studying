package java_basico.aula17;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. inserir numeros
        int a = sc.nextInt();
        int b = sc.nextInt();

       int resultado = a;

       for(int i = 0; i < b; i++){
           resultado *= a;
       }

        System.out.println("resultado: " + resultado);

    }
}
