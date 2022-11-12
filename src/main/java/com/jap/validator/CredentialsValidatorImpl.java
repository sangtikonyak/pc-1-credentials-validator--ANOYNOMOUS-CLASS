package com.jap.validator;

public class CredentialsValidatorImpl {
    public String validateUser(String name, String password) {

        CredentialsValidator credentialsValidator = (user, pass) ->
        {
            if (user.equals("admin") && pass.equals("1234")) {
                return "valid user";
            } else {
                return "invalid user";
            }
        };
        return credentialsValidator.validator(name, password);
    }

    public static void main(String[] args) {
   CredentialsValidatorImpl credentials=new CredentialsValidatorImpl();
        System.out.println("credentials.validateUser(\"sangti\",\"3245\") = " + credentials.validateUser("sangti", "3245"));
        System.out.println("credentials.validateUser(\"admin\",\"1234\") = " + credentials.validateUser("admin", "1234"));
    }
}
