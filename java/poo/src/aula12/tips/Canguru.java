package aula12.tips;

import aula12.Mamifero;

public class Canguru extends Mamifero {
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }

    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
}
