package com.company;

public interface Conta {
    String getTipo();
    String getTitular();
    double getSaldo();

    void depositar(double qnt);
    void sacar(double qnt) throws SaldoInsuficienteException;
}
