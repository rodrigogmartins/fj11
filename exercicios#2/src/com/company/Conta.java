package com.company;

public abstract class Conta {

    private String titular;
    private String tipo;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private void depositar(double quantidade) {
        saldo += quantidade;
    }

    private void sacar(double quantidade) {
        saldo -= quantidade;
    }

    protected abstract double getRendimento();
    public abstract String getTipo();
}
