package com.bintics.solid.isp.bad.exp02.externallib;

import java.util.List;

public interface XProviderNotificationService {

    void sendMessage(String email, String content, String otherData);

    void sendMultiMessage(List<String> emails, String content);

    int getNumberMessagesDelivered();

    MailInfo getLastMessage();

}
