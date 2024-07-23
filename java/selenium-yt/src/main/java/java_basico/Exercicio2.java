package java_basico;


import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero ");

        int num = scan.nextInt();

        descobrir(num);
    }


    public static int descobrir(int num){
        if(num >= 0){
            System.out.println("O numero informado e positivo");
        } else {
            System.out.println("O numero informado e negativo");
        }
        return num;
    }
}
