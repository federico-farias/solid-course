package com.bintics.solid.isp.bad.exp01;

public class UserAccountCreator {

    // Refleja que se utiliza el proveedor Mandril
    public IMandrilNotificationService iMandrilNotificationService;

    // Refleja que se utiliza el proveedor Redis
    public IRedisCacheSerivce iRedisCacheSerivce;

    // Tiene más métodos de los que necesita utilizar UserAccountCreator
    public iUserAccountService iMySqlUserAccountService;

    public IPersistenceProvider iPersistenceProvider;

    public void create(UserInfoDto userInfo) {
        // TODO
        UserInfoDto user = (UserInfoDto) iRedisCacheSerivce.get(userInfo.getEmail());
        if (user != null) {
            return;
        }

        iMandrilNotificationService.sendEmailAccountCreated(userInfo.getEmail(), true);
        iRedisCacheSerivce.record(userInfo.getEmail(), userInfo);
        iMySqlUserAccountService.save(userInfo);
        iPersistenceProvider.headerInterface(userInfo.getEmail(), userInfo, new TTLConfig(1000 * 60 * 60, 5));
    }

}

