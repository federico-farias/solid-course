package com.bintics.solid.ocp.bad;

public class UserAccountCreator {

    // Refleja que utiliza el proveedor MySQL
    // En caso de cambia de proveedor se tendrá que modificar el código del UserAccountCreator
    public MySQLAccountRepository mySQLAccountRepository;

    public void create() {
        // TODO
        mySQLAccountRepository.save(new ClassDummy());
    }

}

