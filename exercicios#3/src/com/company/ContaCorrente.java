package com.company;

public class ContaCorrente implements Conta {

    private String titular;
    private double saldo;

    public ContaCorrente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String getTipo() {
        return "Corrente";
    }

    @Override
    public String getTitular() {
        return this.titular;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(double qnt) {
        if (qnt > 0) {
            this.saldo += qnt;
        } else {
            throw new IllegalArgumentException("Valor de depósito inválido");
        }
    }

    @Override
    public void sacar(double qnt) throws SaldoInsuficienteException{
        if (this.saldo - qnt >= 0) {
            this.saldo -= qnt;
        } else {
            throw new SaldoInsuficienteException(qnt);
        }
    }
}
