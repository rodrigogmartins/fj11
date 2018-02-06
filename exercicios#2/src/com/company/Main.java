package com.company;

public class Main {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.setTitular("Rodrigo");
        c1.setSaldo(5000);
        c1.setTipo("Corrente");
        System.out.println(c1.getRendimento());
        System.out.println(c1.getTitular());
        System.out.println(c1.getSaldo());
        System.out.println(c1.getTipo());
        System.out.println(c1.getValorImposto());
    }
}
