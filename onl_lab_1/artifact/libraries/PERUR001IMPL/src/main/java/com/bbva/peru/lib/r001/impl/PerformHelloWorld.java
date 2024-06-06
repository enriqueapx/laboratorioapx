package com.bbva.peru.lib.r001.impl;

public class PerformHelloWorld {
    private static final String HELLO = "HELLO WORLD";
    private static final String BYE = "BYE";

    public HelloWorldOut perform(HelloWorld) {
        HelloWorldOut result = new HelloWorldOut();
        result.setHello(HELLO + helloWorld.getName());
        result.SetBye(BYE + helloWorld.getName());

        return result;
    }
}
