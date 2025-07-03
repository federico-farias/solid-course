package com.bintics.solid.ocp.good.op1;

public class UserAccountCreator {

    // No refleja detalles de implementación
    // En cualquier momento podría cambiar de implementación si necesidad de modificar
    // código del cliente, por lo tanto se respeta el principio al estar cerrado al cambio.
    public UserAccountRepository userAccountRepository;

    public UserAccountCreator(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    public void create(ClassDummy request) {
        // TODO
        userAccountRepository.save(request);
    }

}

