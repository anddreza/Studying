package java_basico;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner choice = new Scanner(System.in);
        System.out.println("Quantos litros?");
        double litros = choice.nextDouble();

        System.out.println("Qual combustivel?");
        String combustivel = choice.next();

        double gasolina = 2.5;
        double alcool = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;

        if (combustivel.equalsIgnoreCase("a")) {
            if (alcool <= 20) percDesconto = 3;
             else percDesconto = 5;
            total = alcool * litros;

        }
        else if (combustivel.equalsIgnoreCase("g")){
            if (gasolina <= 20) percDesconto = 4;
             else if (gasolina > 20) percDesconto = 6;
            total = gasolina * litros;
        }

            totalDesc = (total / 100) * percDesconto;
            System.out.println("total: " + total);
            System.out.println("Calculo com desconto R$: " + totalDesc);
            System.out.println("Porcentagem do desconto: " + percDesconto + " %");
            double precoAPagar = total - totalDesc;
            System.out.println("Valor a ser pago R$: " + precoAPagar);
        }

    }
