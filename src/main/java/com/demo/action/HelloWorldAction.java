package com.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

    private String message;

    public String execute() {
        message = "Hello, World!";
        System.out.println(message);
        return SUCCESS;
    }

    public String getMessage() {
        System.out.println("In getMessage method, message is: " + message);
        return message;
    }
}
