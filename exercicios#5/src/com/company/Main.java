package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("banco", 1352);
        banco.adicionaConta("Rodrigo", 5000, 1);
        banco.adicionaConta("Teste", 500.43,2);
        banco.adicionaConta("funciona", 99,3);

        System.out.println(banco.buscaConta("Rodrigo"));

        banco.salva();




        System.out.println("Iniciando Array List...");
        Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();

        int total = 30000;

        for (int i = 0; i < total;i++){
            teste.add(i);
        }

        for (int i = 0; i < total;i++){
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);


        System.out.println("Iniciando HashSet...");
        Collection<Integer> teste1 = new HashSet<>();
        long inicio1 = System.currentTimeMillis();

        int total1 = 30000;

        for (int i = 0; i < total1;i++){
            teste1.add(i);
        }

        for (int i = 0; i < total1;i++){
            teste1.contains(i);
        }

        long fim1 = System.currentTimeMillis();
        long tempo1 = fim1 - inicio1;
        System.out.println("Tempo gasto: " + tempo1);

        System.out.println("Iniciando LinkedList...");
        Collection<Integer> teste2 = new LinkedList<>();
        long inicio2 = System.currentTimeMillis();

        int total2 = 30000;

        for (int i = 0; i < total2;i++){
            teste2.add(i);
        }

        for (int i = 0; i < total2;i++){
            teste2.contains(i);
        }

        long fim2 = System.currentTimeMillis();
        long tempo2 = fim2 - inicio2;
        System.out.println("Tempo gasto: " + tempo2);

    }
}
