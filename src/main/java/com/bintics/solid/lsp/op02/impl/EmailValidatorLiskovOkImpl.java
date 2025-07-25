package com.bintics.solid.lsp.op02.impl;

import com.bintics.solid.lsp.op02.UserAcountValidator;
import com.bintics.solid.lsp.op02.EmailMalformedException;
import com.bintics.solid.lsp.op02.UserAccountInfo;

public class EmailValidatorLiskovOkImpl implements UserAcountValidator {

    @Override
    public void validate(final UserAccountInfo user) {
        String[] tokens = user.getEmail().split("[@]");
        if (tokens.length != 2 || !tokens[1].contains(".")) {
            throw new EmailMalformedException("Email no valido: " + user.getEmail());
        }
    }

}
