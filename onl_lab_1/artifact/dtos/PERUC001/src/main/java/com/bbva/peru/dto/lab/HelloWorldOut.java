package com.bbva.peru.dto.lab;

import java.io.Serializable;

public class HelloWorldOut implements Serializable {
    private String hello;
    private String bye;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HelloWorldOut{");
        sb.append("hello='").append(hello).append('\'');
        sb.append(", bye='").append(bye).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getBye() {
        return bye;
    }

    public void setBye(String bye) {
        this.bye = bye;
    }
}
