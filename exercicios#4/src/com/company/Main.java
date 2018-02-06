package com.company;

public class Main {

    public static void main(String[] args) {
        Conta[] contas = new Conta[10];
        TestaArrays geraConta = new TestaArrays();
        geraConta.iniciaContas(contas);

        System.out.println("--------------------------------------");

        TestaSplit inverte = new TestaSplit();
        System.out.println(inverte.inverteFrase("Socorram-me subi no onibus em Marrocos"));

        System.out.println("--------------------------------------");

        Banco banco = new Banco("banco", 1352);
        banco.adicionaConta("Rodrigo", 5000, 1);
        banco.adicionaConta("Teste", 500.43,2);
        banco.adicionaConta("funciona", 99,3);

        banco.mostraContas();

        Conta teste = new Conta("Rodrigo", 5000,1);
        System.out.println(banco.contem(teste));
    }
}
