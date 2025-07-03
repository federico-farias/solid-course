package com.bintics.solid.isp.bad.exp02.ownimpl.impl;

import com.bintics.solid.isp.bad.exp02.externallib.MailInfo;
import com.bintics.solid.isp.bad.exp02.externallib.XProviderNotificationService;
import com.bintics.solid.isp.bad.exp02.ownimpl.IXProviderNotificationService;
import com.bintics.solid.isp.bad.exp02.ownimpl.XMailInfoResponse;

import java.util.List;

public class OwnXProviderNotificationService implements IXProviderNotificationService {

    private XProviderNotificationService service;

    @Override
    public void sendMessage(String email, String content, String otherData) {
        service.sendMessage(email, content, otherData);
    }

    @Override
    public void sendMultiMessage(List<String> emails, String content) {
        service.sendMultiMessage(emails, content);
    }

    @Override
    public int getNumberMessagesDelivered() {
        return service.getNumberMessagesDelivered();
    }

    @Override
    public XMailInfoResponse getLastMessage() {
        MailInfo info = service.getLastMessage();
        XMailInfoResponse response = parse(info);
        return response;
    }

    private XMailInfoResponse parse(MailInfo info) {
        return new XMailInfoResponse();
    }

}
