package java_basico;

import java.util.Scanner;

public class Aula18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = sc.nextInt();

        System.out.println("Entre com um limite: ");
        int max = sc.nextInt();

//        for(int i = num; i <= max; i++){
//            System.out.println(i);
//                if (i % 7 == 0){
//                    System.out.println("O valor de i é " + i);
//                    break;
//                }

        for(int i=0; i <= 4; i++){
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if(i == 1){
                            break rotulo1;
                        }
                        if (i == 2){
                            break rotulo2;
                        }
                        if(i == 3){
                            break rotulo3;
                        }
                        System.out.println("Rotulo3");
                    }
                    System.out.println("Rotulo2");
                }
                System.out.println("Rotulo1");
            }
            System.out.println(i);

        }
    }
}
