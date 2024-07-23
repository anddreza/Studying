package java_basico;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tri1 = sc.nextInt();
        int tri2 = sc.nextInt();
        int tri3 = sc.nextInt();

        if (((tri1 + tri2) > tri3) &&
                ((tri1 + tri3) > tri2) &&
                ((tri3 + tri2) > tri1)) {

        if (tri1 == tri2 && tri1 == tri3 && tri3 == tri1){
            System.out.println("Equilatero");
        } else if (tri1 == tri2 || tri1 == tri3 || tri2 == tri3){
            System.out.println("Isosceles");
        } else if (tri1 != tri2 && tri1 == tri3 && tri3 != tri2){
            System.out.println("Escaleno");
        }


        } else {
            System.out.println("Não é um triangulo");
        }



    }

//    public static int triangulo(int tri1, int tri2, int tri3){
//
//
//    }

}
