package com.bintics.solid.lsp.op02;

public class UserAccountInfo {

    private String email;

    public UserAccountInfo(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserAccountInfo{" +
                "email='" + email + '\'' +
                '}';
    }

}
