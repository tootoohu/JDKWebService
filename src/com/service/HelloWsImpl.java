package com.service;

import javax.jws.WebService;

@WebService
public class HelloWsImpl implements HelloWs{
    @Override
    public String getValue(String name) {
        System.out.println("server call getValue " + name);
        return "server --> ";
    }
}
