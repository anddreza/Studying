package aula5;

import java.util.Scanner;

public class Conta {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public void estadoAtual(){
        System.out.println("-------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }

    public Conta() {
//        this.numConta = numConta;
//        this.tipo = tipo;
//        this.dono = dono;
//        this.saldo = saldo;
//        this.status = status;


        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC"){
            System.out.println("Conta Corrente criada com sucesso! Você ganhou R$ 50,00");
            this.setSaldo(50);
        } else if (t == "CP"){
            System.out.println("Conta Poupança criada com sucesso! Você ganhou R$ 150,00");
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.getSaldo() <= 0){
            System.out.println("Não é possível fechar sua conta, necessário quitar saldo negativo!");
        } else if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, ainda tem dinheiro nela!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    //valor -> v
    public void depositar(float v){
        if(this.getStatus()){
         //   this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }

    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }

        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma mensalidade");
        }

    }





    //  GET E SET

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
