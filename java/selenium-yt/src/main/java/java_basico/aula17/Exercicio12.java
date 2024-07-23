package java_basico.aula17;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        System.out.println("Tabuada de :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 0; i < 10; i++){
            System.out.println(number + "x" + i + " = " + number * i);
        }


    }
}
