package com.bintics.solid.lsp;

import com.bintics.solid.lsp.op02.UserAccountInfo;
import com.bintics.solid.lsp.op02.UserAcountValidator;
import com.bintics.solid.lsp.op02.UserCreatorUseCase;
import com.bintics.solid.lsp.op02.impl.EmailValidatorLiskovOkImpl;
import com.bintics.solid.lsp.op02.impl.UserAccountRepositoryMySQLImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserCreatorUseCaseTest {

    @Test
    public void processTest() {

        UserAccountRepositoryMySQLImpl repositoryMySQL = new UserAccountRepositoryMySQLImpl();

        UserAcountValidator validator =
                new EmailValidatorLiskovOkImpl();
                //new EmailValidatorLiskovViolationImpl();

        UserCreatorUseCase userCreator = new UserCreatorUseCase(
                repositoryMySQL,
                validator
        );

        UserAccountInfo userinfo = new UserAccountInfo("ffarias@domain.com");

        userCreator.create(userinfo);

        assertEquals("ffarias@domain.com", userinfo.getEmail());
        System.out.println(userinfo);
    }

}