package com.bintics.solid.ocp.good.op2.impl;

import com.bintics.solid.ocp.good.op2.Cotizador;
import com.bintics.solid.ocp.good.op2.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class CotizadorAutos extends AbstractCotizador implements Cotizador {

    @Override
    List<Proveedor> obtenerProveedores() {
        // TODO: Obtener proveedores filtrado por autos
        System.out.println("Método plantilla -  autos");
        return new ArrayList<>();
    }

}
