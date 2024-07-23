package java_basico;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira: ");
        String input = scanner.next();

        if(input.equalsIgnoreCase("m")){
            System.out.println("Masculino");
        } else if (input.equalsIgnoreCase("f")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
