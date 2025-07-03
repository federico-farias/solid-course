package com.bintics.solid.isp.bad.exp02.ownimpl;

import java.util.List;

public interface IXProviderNotificationService {

    // El tercer parametro refleja la necesidad del proveedor no del cliente.
    void sendMessage(String email, String content, String otherData);

    // El cliente no necesita el método.
    void sendMultiMessage(List<String> emails, String content);

    // El cliente no necesita el método.
    int getNumberMessagesDelivered();

    // El cliente no necesita el método.
    XMailInfoResponse getLastMessage();

}
