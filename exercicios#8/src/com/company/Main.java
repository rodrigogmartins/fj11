package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Collection<String> mensagens = new HashSet<>();

        Thread t1 = new Thread(new CriarMensagens(0, 10000, mensagens));
        Thread t2 = new Thread(new CriarMensagens(10000, 20000, mensagens));
        Thread t3 = new Thread(new CriarMensagens(20000, 30000, mensagens));
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mensagens criadas");

        for (int i = 0; i < 15000; i++) {
            if (!mensagens.contains("Mensagem " + i)) {
                throw new IllegalStateException("A mensagem: "+i+" não foi encontrada.");
            }
        }

        if (mensagens.contains(null)) {
            throw new IllegalStateException("Mensagem com null encontrada");
        }
        System.out.println("Terminada");
    }
}
