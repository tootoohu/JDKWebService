package com.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWs {

    @WebMethod
    String getValue(String name);
}
