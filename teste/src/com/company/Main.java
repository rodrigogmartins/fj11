package com.company;

public class Main {

    public static void main(String[] args) {

        DateTime dataInicial = new DateTime(2012, 12, 1, 12, 0);
        DateTime dataFinal = new DateTime(2012, 12, 28, 12, 30);
        DateTime feriado = new DateTime(2012, 12, 25, 12, 0);

        int dias = Days.daysBetween(dataInicial, dataFinal).getDays();

    }
}
