package com.bintics.solid.ocp.good.op0;

public class SMSNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
        // TODO: 50 lineas
    }
}
