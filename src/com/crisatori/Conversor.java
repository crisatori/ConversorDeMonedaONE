package com.crisatori;

public class Conversor {
    private final double tasaDOPUSD = 55.12; //cantidad de pesos que me dan por 1 dolar.
    private final double tasaMXNUSD = 17.12; //...mexicanos

    public void convertirMonedas(int cantidad) {
        System.out.println((cantidad * tasaDeReferncia));
        //System.out.println((cantidad * moneda1.getValor()) / tasaDeReferncia);
    }

    /*public void convertirMonedas(int cantidad, Moneda moneda1, Moneda moneda2) {
        System.out.println((cantidad * tasaDeReferncia));
        //System.out.println((cantidad * moneda1.getValor()) / tasaDeReferncia);
    }*/
}

