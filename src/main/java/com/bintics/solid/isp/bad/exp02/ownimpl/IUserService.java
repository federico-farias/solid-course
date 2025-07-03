package com.bintics.solid.isp.bad.exp02.ownimpl;

public interface IUserService {

    void create(UserInfo user);

    void updatePassword(String oldPassword, String newPassword);

    void updateUser(UserInfo user);

}
