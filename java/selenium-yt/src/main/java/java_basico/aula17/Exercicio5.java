package java_basico.aula17;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num;
     int maior = Integer.MIN_VALUE;

     for(int i = 0; i < 5; i++){
         System.out.println("Escreva um numero: ");
         num = sc.nextInt();

         if(num > maior){
             maior = num;
             System.out.println("O numero maior mudou para: " + maior);
         }
     }
        System.out.println("O maior numero é: " + maior);
    }
}
