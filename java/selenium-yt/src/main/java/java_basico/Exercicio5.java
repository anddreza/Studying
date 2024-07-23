package java_basico;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        float resultado = nota(a, b, c);
        System.out.println("As notas foram: " + resultado);
    }

    public static float nota(float a, float b, float c){

        float m;
        m = ((a + b + c)/3);

        if (m >= 7){
            System.out.println("APROVADO");
        } else if (m < 7){
            System.out.println("REPROVADO");
        } else if (m == 10){
            System.out.println("APROVADO COM LOUVOR");
        }

        return m;
    }
}
