package collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1L, "Joao"));
        Pessoa a = pessoas.get(0);
      //  pessoas.remove(a);

        for (Pessoa pessoa: pessoas){
            System.out.println(pessoa.getNome());
        }

        System.out.println("-----");
        pessoas.add(a);


        for (Pessoa pessoa: pessoas){
            System.out.println(pessoa.getNome());
        }


        //Aqui ele duplica o registro
        //Vem primeiro Joao
        //Na segunda vez vem Joao duas vezes
    }

}
