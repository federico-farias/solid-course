package com.bintics.solid.isp.good.ownimpl;

// Refleja que su rol es asegurarse que no existe otra cuenta con el mismo email (Roleinterfaces)
public interface EnsureUserAccountDoesNotExist {

    void ensure(String email);

}
