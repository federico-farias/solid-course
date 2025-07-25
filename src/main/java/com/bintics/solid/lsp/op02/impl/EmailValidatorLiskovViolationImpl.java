package com.bintics.solid.lsp.op02.impl;

import com.bintics.solid.lsp.op02.UserAcountValidator;
import com.bintics.solid.lsp.op02.UserAccountInfo;

public class EmailValidatorLiskovViolationImpl implements UserAcountValidator {

    @Override
    public void validate(UserAccountInfo user) {
        // TODO: Código espagueti
        user.setEmail("email-mutado@domain.com"); // Por accidente el objeto es mutado.
    }

}
