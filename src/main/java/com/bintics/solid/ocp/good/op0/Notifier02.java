package com.bintics.solid.ocp.good.op0;

public class Notifier02 {

    public void send(String type, String message) {
        Notifier notifier = NotifierFactory.get(type);
        notifier.send(message);
    }

}
