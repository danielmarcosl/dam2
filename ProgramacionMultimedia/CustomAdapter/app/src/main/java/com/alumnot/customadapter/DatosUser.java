package com.alumnot.customadapter;

import java.io.Serializable;

public class DatosUser implements Serializable {
    String user;
    String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;

    }

    public void setUser(String user) {
        this.user = user;
    }

    DatosUser(String user,String pass){
        this.user=user;
        this.pass=pass;
    }
}
