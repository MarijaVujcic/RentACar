package com.minterm.rentacar.Model;

public class Role {
    String admin;

    public Role(String admin, String user) {
        this.admin = admin;
        this.user = user;
    }
    String user;

    public String getAdmin() {
        return this.admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}