package com.company;

public class Conta {

    private String titular;
    private double saldo;
    private int numero;

    public Conta(String titular, double saldo, int numero) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero: "+this.numero+"\ntitular: "+this.titular+"\nSaldo: "+this.saldo;
    }
}

