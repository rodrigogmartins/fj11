package com.company;

import java.util.Collection;

public class CriarMensagens implements Runnable{
    private int comeco;
    private int fim;
    private Collection<String> mensagens;

    public CriarMensagens(int comeco, int fim, Collection<String> mensagens) {
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens = mensagens;
    }

    public void run() {
        for (int i = comeco; i < fim; i++) {
            synchronized (mensagens) {
                mensagens.add("Mensagem " + i);
            }
        }
    }
}
