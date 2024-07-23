package java_basico.aula17;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i < a; i++){
            // F(n + 2) = F(n + 1) + F(n) , com n ≥ 1 e F(1) = F(2) = 1

            System.out.println("Série: " + i );
        }
    }
}
