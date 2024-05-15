package aula12;

import aula12.tips.Cachorro;
import aula12.tips.Canguru;

public class Main {
    public static void main(String[] args) {
        //Animal n1 = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        c.locomover();
        k.locomover();
    }
}
