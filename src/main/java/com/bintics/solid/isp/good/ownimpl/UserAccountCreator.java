package com.bintics.solid.isp.good.ownimpl;

public class UserAccountCreator {

    public final EnsureUserAccountDoesNotExist notExistsUserAccount;

    public final UserRepository userRepository;

    public final EmailSender emailSender;

    public UserAccountCreator(EnsureUserAccountDoesNotExist ensurer, UserRepository userRepository, EmailSender emailSender) {
        this.notExistsUserAccount = ensurer;
        this.userRepository = userRepository;
        this.emailSender = emailSender;
    }

    public void create(UserInfo user) {
        notExistsUserAccount.ensure(user.getEmail());
        userRepository.save(user);
        emailSender.send(user.getEmail(), "Mi mensaje");
    }

}

