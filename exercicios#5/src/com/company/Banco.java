package com.company;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Banco {

    private String nome;
    private int numero;
    private Map<String, Conta> contasMap;
    private ArrayList<Conta> contas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contasMap = new HashMap<>();
        this.contas = new ArrayList<>();
    }

    public void adicionaConta(String titular, double saldo, int numero){
        Conta conta = new Conta(titular, saldo, numero);
        contas.add(conta);
        contasMap.put(titular, conta);
    }

    public String buscaConta(String titular) {
        return contasMap.get(titular).toString();
    }

    public void salva() {
        PrintStream stream = null;
        try {
            stream = new PrintStream("banco.txt");
            for (Conta conta : contas){
                stream.println(conta.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            stream.close();
        }
    }

}
