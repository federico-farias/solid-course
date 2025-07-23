package com.bintics.solid.ocp.good.op0;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Enviando correo: " + message);
        // TODO: 30 lineas de codigo
    }
}
