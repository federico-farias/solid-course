package com.bintics.solid.ocp.good.op2;

import com.bintics.solid.ocp.good.op2.impl.CotizadorAutos;
import org.junit.jupiter.api.Test;

public class CotizadorOp02Test {

    @Test
    void cotizar() {
        //Cliente cliente = new Cliente(new CotizadorMotos());
        Cliente cliente = new Cliente(new CotizadorAutos());
        cliente.ejecutar(new InfoCotizacion("ffarias@domain.com"));
    }

}
