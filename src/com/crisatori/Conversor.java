package com.crisatori;

public class Conversor {
    private final double tasaDOPUSD = 55.12; //cantidad de pesos que me dan por 1 dolar.
    private final double tasaMXNUSD = 17.12; //...mexicanos

    public void convertirMonedas(double cantidad) {
        double DOP_A_USD = cantidad / this.tasaDOPUSD;
        double DOP_A_MXN = DOP_A_USD * this.tasaMXNUSD;
        System.out.println(DOP_A_MXN + "MXN");
    }

    /*public void convertirMonedas(int cantidad, Moneda moneda1, Moneda moneda2) {
        System.out.println((cantidad * tasaDeReferncia));
        //System.out.println((cantidad * moneda1.getValor()) / tasaDeReferncia);
    }*/
}

