package com.bintics.solid.ocp.good.op3;

import com.bintics.solid.ocp.good.op3.impl.LoggerDecorator;
import com.bintics.solid.ocp.good.op3.impl.CotizadorMotos;
import com.bintics.solid.ocp.good.op3.impl.EnviarEmailCoponesDescuentoDecorator;
import org.junit.jupiter.api.Test;

class CotizadorOp03Test {

    @Test
    void cotizar() {
        Cotizador cotizador =
                new EnviarEmailCoponesDescuentoDecorator(
                        new LoggerDecorator(
                                new CotizadorMotos()));
        cotizador.cotizar(
                new CotizarRequest(
                        "Federico",
                        "Distinguido",
                        "ffarias@domain.com"));
    }

}