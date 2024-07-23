package java_basico.aula17;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estado_civil;

        do {
            System.out.println("Nome");
            nome = sc.next();

            if(nome.length() > 3){
                infoValida = true;
            } else {
                System.out.println("Precisa mais de 3 caracteres");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Idade");
            idade = sc.nextInt();

            if(idade > 0 && idade < 150){
                infoValida = true;
            } else {
                System.out.println("Idade tem que ser válida");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Salario");
            salario = sc.nextDouble();

            if(salario > 0){
                infoValida = true;
            } else {
                System.out.println("Salario tem que ser válido");
            }

        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Sexo");
            sexo = sc.next();

            if(sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                System.out.println("Sexo tem que ser válido");
            }

        } while (!infoValida);


        infoValida = false;
        do {
            System.out.println("Estado Civil");
            estado_civil = sc.next();

            if(estado_civil.equalsIgnoreCase("s") ||
                    estado_civil.equalsIgnoreCase("c") ||
                    estado_civil.equalsIgnoreCase("v") ||
                    estado_civil.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                System.out.println("Sexo tem que ser válido");
            }
        } while (!infoValida);


        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(estado_civil);
    }
}