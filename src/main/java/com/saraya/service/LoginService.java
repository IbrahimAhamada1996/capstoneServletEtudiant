package com.saraya.service;

import java.util.Objects;

public class LoginService {

    public boolean connexionAdmin(String username,String password){
        return username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin");
    }

    public boolean connexionAdmin6(String username,String password){
        return username.equalsIgnoreCase("admin6") && password.equalsIgnoreCase("admin6");
    }

    public boolean connexionAdmin16(String username,String password){
        return username.equalsIgnoreCase("admin16") && password.equalsIgnoreCase("admin16");
    }
}
