package com.company;

import java.util.HashMap;
import java.util.Map;

public class Banco {

    private String nome;
    private int numero;
    private Conta[] contas;
    private Map<String, Conta> contasMap;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new Conta[2];
        this.contasMap = new HashMap<>();
    }

    public void adicionaConta(String titular, double saldo, int numero){
        if (buscaEspaco() != -1) {
            Conta conta = new Conta(titular, saldo, numero);
            contas[buscaEspaco()] = conta;
        } else {
            int tamanho = contas.length+10;
            Conta[] contasAntigas = this.contas;
            this.contas = new Conta[tamanho];
            this.contas = contasAntigas;
        }
    }

    public int buscaEspaco() {
        for (int i = 0; i < contas.length; i++){
            if (contas[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void mostraContas() {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] != null) {
                System.out.println(contas[i].toString());
                //System.out.println("Titular da conta "+i+":.."+contas[i].getTitular());
                //System.out.println("Saldo da conta "+i+":...."+contas[i].getSaldo());
                System.out.println("--------------------------------------");
            }
        }
    }

    public String contem (Conta conta) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getNumero() == conta.getNumero()) {
                return "Conta existente";
            }
        }
        return "Conta inexistente";
    }
}
