package com.bintics.solid.ocp.good.op0;

public class PushNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Enviando notificación push: " + message);
        // TODO: 30 lineas
    }
}
