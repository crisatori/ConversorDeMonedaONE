package com.crisatori;

public class Prueba {
    public static void main(String[] args) {
        Moneda dop = new Moneda("DOP", 55.35);
        Moneda usd = new Moneda("USD", 1.0);
        Conversor conversor = new Conversor();
        conversor.convertirMonedas(20, dop, usd);
    }
}
//regla de tres para obtener resultado.