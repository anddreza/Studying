package collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();
        Pessoa joao = new Pessoa(1L, "Joao");
        pessoas.add(joao);

        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.getNome());
        }

        System.out.println("------");
        boolean adicionou = pessoas.add(new Pessoa(1L, "Joao"));
        if(adicionou) System.out.println("adicionou");
        else System.out.println("não adicionou ");
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.getNome());
        }

        //Um elemento Joao


    }
}
