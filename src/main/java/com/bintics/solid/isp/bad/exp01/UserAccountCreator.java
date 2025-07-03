package com.bintics.solid.isp.bad.exp01;

public class UserAccountCreator {

    // Refleja que se utiliza el proveedor Mandril
    public IMandrilNotificationService iMandrilNotificationService;

    // Refleja que se utiliza el proveedor Redis
    public IRedisCacheSerivce iRedisCacheSerivce;

    // Tiene más métodos de los que necesita utilizar UserAccountCreator
    public iUserAccountService iMySqlUserAccountService;

    public IPersistenceProvider iPersistenceProvider;

    public void create() {
        // TODO
        iMandrilNotificationService.sendEmailAccountCreated("account@domain.com");
        iRedisCacheSerivce.record(new ClassDummy());
        iMySqlUserAccountService.save(new ClassDummy());
        iPersistenceProvider.headerInterface("Value of provider 1", "Value of provider 2");
    }

}

