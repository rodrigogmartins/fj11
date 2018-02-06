package com.company;

public class TestaSplit {

    public String inverteFrase(String s){
        String[] frase = s.split(" ");
        String fraseInvertida = "";

        for(int i = frase.length-1; i >= 0; i--) {
            fraseInvertida+= frase[i]+" ";
        }
        return fraseInvertida;
    }
}
