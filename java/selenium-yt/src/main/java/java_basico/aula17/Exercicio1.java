package java_basico.aula17;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota: ");
            double nota = sc.nextDouble();

            if(nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou " + nota);
            }else{
               // notaValida = false;
                System.out.println("Nota inválida, digite novamente");
            }

        } while(!notaValida);
    }
}
