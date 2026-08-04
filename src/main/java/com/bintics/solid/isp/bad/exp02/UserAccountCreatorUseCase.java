package com.bintics.solid.isp.bad.exp02;

import com.bintics.solid.isp.bad.exp02.ownimpl.IUserService;
import com.bintics.solid.isp.bad.exp02.ownimpl.IXProviderNotificationService;
import com.bintics.solid.isp.bad.exp02.ownimpl.UserInfo;

public class UserAccountCreatorUseCase {

    public IUserService iUserService;

    // Refleja detalles de implementación (Refleja que utiliza al proveedor X)
    public IXProviderNotificationService notificationService;

    public UserAccountCreatorUseCase(IUserService iUserService, IXProviderNotificationService notificationService) {
        this.iUserService = iUserService;
        this.notificationService = notificationService;
    }

    public void create(UserInfo user) {
        iUserService.create(user);

        // Refleja que el proveedor requiere del tercer parametro, pero el cliente no lo necesita.
        notificationService.sendMessage(user.getEmail(), "Mi mensaje", null);
    }

}

