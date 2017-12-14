package com.example.frederickgarcia.zodiaco;

/**
 * Created by Frederick Garcia on 28-11-2017.
 */
public class Usuarios {

    private String name;
    private String password;

    public Usuarios() {
    }

    public Usuarios(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
