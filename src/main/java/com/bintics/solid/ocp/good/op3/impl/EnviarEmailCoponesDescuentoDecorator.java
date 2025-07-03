package com.bintics.solid.ocp.good.op3.impl;

import com.bintics.solid.ocp.good.op3.Cotizador;
import com.bintics.solid.ocp.good.op3.CotizarRequest;

public class EnviarEmailCoponesDescuentoDecorator extends CotizadorBaseDecorator {

    public EnviarEmailCoponesDescuentoDecorator(Cotizador cotizador) {
        super(cotizador);
    }

    @Override
    public void cotizar(CotizarRequest request) {
        super.cotizar(request);
        if (request.getEmail().equalsIgnoreCase("Distinguido")) {
            System.out.println("Se envia cupon de descuento al email: " + request.getEmail());
        }
    }

}
