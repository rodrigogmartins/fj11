package com.company;

public class ContaCorrente extends Conta implements Tributo{

    private int operacao = 013;

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public double getRendimento(){
        return this.getSaldo() * 0.4;
    }

    @Override
    public String getTipo() {
        return "sua conta é: corrente"   ;
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.07;
    }
}
