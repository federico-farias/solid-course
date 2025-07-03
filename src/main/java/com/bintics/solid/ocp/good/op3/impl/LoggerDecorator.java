package com.bintics.solid.ocp.good.op3.impl;

import com.bintics.solid.ocp.good.op3.Cotizador;
import com.bintics.solid.ocp.good.op3.CotizarRequest;

public class LoggerDecorator extends CotizadorBaseDecorator {

    public LoggerDecorator(Cotizador cotizador) {
        super(cotizador);
    }

    @Override
    public void cotizar(CotizarRequest request) {
        System.out.println("Logeando cotización del cliente: " + request.getNombreCliente());
        super.cotizar(request);
    }
}
