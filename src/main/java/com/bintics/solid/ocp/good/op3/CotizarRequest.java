package com.bintics.solid.ocp.good.op3;

public class CotizarRequest {

    private final String nombreCliente;

    private final String tipoCliente;

    private final String email;

    public CotizarRequest(String nombreCliente, String tipoCliente, String email) {
        this.nombreCliente = nombreCliente;
        this.tipoCliente = tipoCliente;
        this.email = email;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getEmail() {
        return email;
    }

}
