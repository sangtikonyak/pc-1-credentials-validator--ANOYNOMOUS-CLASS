package com.jap.validator;
@FunctionalInterface
public interface CredentialsValidator {

    public String validator(String userid, String password);

}
