package collections;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    /*  The long keyword is a data type that can store whole numbers from -9223372036854775808
    to 9223372036854775808. */
    public static void main(String[] args) {

    Map<Long, Pessoa> mapa = new HashMap<>();
    Pessoa joao = new Pessoa(1L, "Joao");

    mapa.put(1L, joao);
    Pessoa joao2 = mapa.get(1L);

    }
}
