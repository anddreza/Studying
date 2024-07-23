package java_basico.aula17;

import java.util.Scanner;

public class Exercicio2 {

    boolean infoValidas = false;

    public static void main(String[] args) {
        boolean infoValidas = false;
        String user;
        String senha;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite seu nome de usuário: ");
            user = sc.next();
            System.out.println("Digite sua senha de usuario: ");
            senha = sc.next();

            if (user.equalsIgnoreCase(senha)) {
                System.out.println("Seu nome não pode ser igual a senha");

            } else {
                infoValidas = true;
                System.out.println("Cadastrado com sucesso! ");
            }

        } while (!infoValidas);
    }
}
