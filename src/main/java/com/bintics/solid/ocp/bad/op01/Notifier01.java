package com.bintics.solid.ocp.bad.op01;

public class Notifier01 {

    public void send(String type, String message) {
        if ("EMAIL".equalsIgnoreCase(type)) {
            System.out.println("Enviando correo: " + message);
        } else {
            throw new IllegalArgumentException("Tipo de notificación no soportado");
        }
    }

}
