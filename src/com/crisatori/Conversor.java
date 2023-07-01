package com.crisatori;

public class Conversor {


    public void convertirMonedas(int valor, Moneda moneda1, Moneda moneda2) {
        System.out.println((valor * moneda1.getValor()) / moneda2.getValor());
    }

}
