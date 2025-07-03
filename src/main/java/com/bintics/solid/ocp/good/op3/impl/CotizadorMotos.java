package com.bintics.solid.ocp.good.op3.impl;

import com.bintics.solid.ocp.good.op3.Cotizador;
import com.bintics.solid.ocp.good.op3.CotizarRequest;

public class CotizadorMotos implements Cotizador {

    @Override
    public void cotizar(CotizarRequest request) {
        System.out.println("Se cotiza motos para el cliente: " + request.getNombreCliente() + " - Tipo de cliente: " + request.getTipoCliente());
    }

}
