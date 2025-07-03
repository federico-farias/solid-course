package com.bintics.solid.ocp.good.op2;

public class Cliente {

    private final Cotizador cotizador;

    public Cliente(Cotizador cotizador) {
        this.cotizador = cotizador;
    }

    public void ejecutar(InfoCotizacion cotizacion) {
        this.cotizador.cotizar(cotizacion);
    }

}
