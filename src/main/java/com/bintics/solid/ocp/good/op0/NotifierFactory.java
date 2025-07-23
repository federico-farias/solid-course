package com.bintics.solid.ocp.good.op0;

public class NotifierFactory {

    public static Notifier get(String type) {
        if ("EMAIL".equalsIgnoreCase(type)) {
            return new EmailNotifier();
        } else if ("SMS".equalsIgnoreCase(type)) {
            return new SMSNotifier();
        } else if ("PUSH".equalsIgnoreCase(type)) {
            return new PushNotifier();
        }
        return null;
    }

}
