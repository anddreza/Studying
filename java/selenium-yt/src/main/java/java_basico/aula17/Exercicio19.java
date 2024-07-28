package java_basico.aula17;

import java.util.Scanner;

public class Exercicio19 {
    //menor valor, maior valor, soma dos valores


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double menor, maior, valorLido, cont = 0.0;
        menor = maior = null;

        while (true) {
            valorLido = input.nextDouble();
            if (valorLido == 0) {
                break;
            }
            if (maior == null) {
                maior = menor = valorLido;
            } else if (valorLido > maior) {
                maior = valorLido;
            } else if (valorLido < menor) {
                menor = valorLido;
            }

            cont += valorLido;

        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("Valor: " + cont);
        
    }
}
