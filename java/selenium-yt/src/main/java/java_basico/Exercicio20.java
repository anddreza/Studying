package java_basico;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner questions = new Scanner(System.in);


        System.out.println("Telefonou para a vitima? ");
        String first = questions.next();
        System.out.println("Esteve no local do crime? ");
        String second = questions.next();
        System.out.println("Mora perto da vitima? ");
        String third = questions.next();
        System.out.println("Devia para a vitima? ");
        String quarto = questions.next();
        System.out.println("Ja trabalhou para a vitima? ");
        String quinto = questions.next();

        int cont = 0;

        if(first.equalsIgnoreCase("S")) cont++;
        if(second.equalsIgnoreCase("S")) cont++;
        if(third.equalsIgnoreCase("S")) cont++;
        if(quarto.equalsIgnoreCase("S")) cont++;
        if(quinto.equalsIgnoreCase("S")) cont++;


        if(cont == 2) {
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cumplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else if (cont == 0){
            System.out.println("Inocente");
        }
    }
}
