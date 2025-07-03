package com.bintics.solid.ocp.good.op1.impl;

import com.bintics.solid.ocp.good.op1.UserAccountRepository;

public class UserAccountRepositoryMySqlImpl implements UserAccountRepository {

    @Override
    public void save(Object obj) {
        // TODO
        System.out.println("Implementación MySQL");
    }

}
