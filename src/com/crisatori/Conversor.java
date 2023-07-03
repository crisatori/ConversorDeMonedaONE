package com.crisatori;

public class Conversor {
    private final double tasaDeReferncia = 0.018;

    public void convertirMonedas(int cantidad) {
        System.out.println((cantidad * tasaDeReferncia));
        //System.out.println((cantidad * moneda1.getValor()) / tasaDeReferncia);
    }

    /*public void convertirMonedas(int cantidad, Moneda moneda1, Moneda moneda2) {
        System.out.println((cantidad * tasaDeReferncia));
        //System.out.println((cantidad * moneda1.getValor()) / tasaDeReferncia);
    }*/
}

