package com.company;

public class TestaArrays {

    public void iniciaContas(Conta[] contas) {
        double mediaSaldos = 0;
        for (int i = 0; i < contas.length; i++) {
            double saldo = i*876;
            contas[i] = new Conta("Conta"+i, saldo, i);
            mediaSaldos += saldo;
            System.out.println("Saldo da conta "+(i+1)+": "+contas[i].getSaldo());
        }
        System.out.println("Media: "+mediaSaldos/contas.length);
    }

}
