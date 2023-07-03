package com.crisatori;

public class Prueba {
    public static void main(String[] args) {
        Moneda dop = new Moneda("DOP", 55.35);
        Moneda usd = new Moneda("USD", 1);
        Conversor conversor = new Conversor();
        conversor.convertirMonedas(20);
        System.out.println(1000/55.12 + "USD");
        System.out.println(18.14*17.12 + "MXN");

    }
}
//regla de tres para obtener resultado.