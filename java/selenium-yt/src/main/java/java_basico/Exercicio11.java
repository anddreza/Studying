package java_basico;

import java.util.Scanner;
//Seria melhor usar o double ou o float?
public class Exercicio11 {

    private static float res = 0;
    private static float ajuste;
    private static float aumento;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu salario: " + sc);
        float a = sc.nextFloat();

        sal(a);

        System.out.println("Salario: " + a);
        System.out.println("Percentual: " + res);
        System.out.println("Aumento:  " + aumento);
        System.out.println("Ajuste: " + ajuste);

    }

    public static float sal(float a){

        if (a <= 280){
            res = 20;
        } else if (a > 280 && a < 700){
            res = 15;
        } else if (a > 700 && a < 1500){
            res = 10;
        } else if (a > 1500){
            res = 5;
        }

        aumento = (a / 100) * res;
        ajuste = a + aumento;

        return a;
    }

}
