package com.bintics.solid.lsp.impl;

import com.bintics.solid.lsp.UserAcountValidator;
import com.bintics.solid.lsp.EmailMalformedException;
import com.bintics.solid.lsp.UserAccountInfo;

public class EmailValidatorLiskovOkImpl implements UserAcountValidator {

    @Override
    public void validate(final UserAccountInfo user) {
        String[] tokens = user.getEmail().split("[@]");
        if (tokens.length != 2 || !tokens[1].contains(".")) {
            throw new EmailMalformedException("Email no valido: " + user.getEmail());
        }
    }

}
