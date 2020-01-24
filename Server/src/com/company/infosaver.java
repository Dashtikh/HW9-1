package com.company;

import Remote.SiteInterface;

import java.rmi.server.UnicastRemoteObject;

public class infosaver extends UnicastRemoteObject implements SiteInterface {
    String user , password;
    public infosaver() throws Exception {}

    @Override
    public String save(String user, String password) throws Exception {
        this.user=user;
        this.password=password;
        System.out.println("used");
        return "your info is"+user+":"+password;

    }

    @Override
    public String update(String user, String password) throws Exception {
        this.user=user;
        this.password=password;
        System.out.println("used");
        return "your new info is"+user+":"+password;

    }
}
