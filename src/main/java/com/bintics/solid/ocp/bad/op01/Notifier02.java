package com.bintics.solid.ocp.bad.op01;

public class Notifier02 {

    public void send(String type, String message) {
        if ("EMAIL".equalsIgnoreCase(type)) {
            System.out.println("Enviando correo: " + message);
            // TODO: 30 lineas de codigo
        } else if ("SMS".equalsIgnoreCase(type)) {
            System.out.println("Enviando SMS: " + message);
            // TODO: 50 lineas
        } else if ("PUSH".equalsIgnoreCase(type)) {
            System.out.println("Enviando notificación push: " + message);
            // TODO: 30 lineas
        } else {
            throw new IllegalArgumentException("Tipo de notificación no soportado");
        }
    }

}
