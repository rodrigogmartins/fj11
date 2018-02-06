package com.company;

public class Main {

    public static void main(String[] args) {
	    ContaCorrente c = new ContaCorrente("Rodrigo", 1000);

        System.out.println("Saldo inicial:......"+c.getSaldo());

        c.depositar(300);
        System.out.println("Saldo pós depósito:."+c.getSaldo());

        try {
            c.sacar(1500000);
        } catch (SaldoInsuficienteException e){
            e.printStackTrace();
        }

        System.out.println("Saldo pós saque:...."+c.getSaldo());

        System.out.println("Tipo de conta:......"+c.getTipo());
        System.out.println("Titular:............"+c.getTitular());
    }
}
