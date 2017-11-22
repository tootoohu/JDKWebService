package com.service;

import javax.xml.ws.Endpoint;

import com.service.HelloWsImpl;

public class ServerTest {


    public static void main(String[] args) {
        String address="http://localhost:8087/webservice/hello";

        Endpoint.publish(address, new HelloWsImpl());
        System.out.println("webservice publish success");

    }

}
