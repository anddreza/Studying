package java_basico;

import java.util.Scanner;

import java.text.DecimalFormat;


public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a fruta: ");
        String fruta = sc.next();

        System.out.println("Quantidade de fruta: ");
        int kg = 0;
        kg = sc.nextInt();

        double valor = 0;
        double total = 0;

        double valorApagar = 0;
        double valorFinal = 0;

        if(fruta.equalsIgnoreCase("morango")){
            if(kg <= 5) valor = 2.5;
            else if (kg > 5) valor = 2.2;
            total = kg * valor;
        }

        if (fruta.equalsIgnoreCase("maca")) {
            if (kg <= 5) valor = 1.8;
            else if(kg > 5) valor = 1.5;
            total = kg * valor;
        }


        DecimalFormat df = new DecimalFormat("#,###.00");

        if(total > 25){
            valor = 0.10;
            valorApagar = (total /100) * valor;
            valorFinal = total - valorApagar ;
            System.out.println("Valor original seria da fruta " + fruta + " R$ " + df.format(total));
            System.out.println("Valor a ser pago para " + fruta + " foi de R$ " + df.format(valorFinal) + " pois há um desconto de 10%");

        } else {
            System.out.println("Valor a ser pago para " + fruta + " foi de R$ " + df.format(total));
        }

    }
}
