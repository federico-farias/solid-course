package com.bintics.solid.lsp;

public class UserCreatorUseCase {

    private final UserAccountRepository userAccountRepository;

    private final UserAcountValidator emailValidator;

    public UserCreatorUseCase(UserAccountRepository userAccountRepository, UserAcountValidator emailValidator) {
        this.userAccountRepository = userAccountRepository;
        this.emailValidator = emailValidator;
    }

    public void create(UserAccountInfo user) {
        emailValidator.validate(user);
        userAccountRepository.save(user);
    }

}
