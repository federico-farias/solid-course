package com.bintics.solid.lsp.impl;

import com.bintics.solid.lsp.UserAcountValidator;
import com.bintics.solid.lsp.UserAccountInfo;

public class EmailValidatorLiskovViolationImpl implements UserAcountValidator {

    @Override
    public void validate(UserAccountInfo user) {
        // TODO: Código espagueti
        user.setEmail("email-mutado@domain.com"); // Por accidente el objeto es mutado.
    }

}
