package com.javastudy.singleton;

public class AClass {
    private SocketClient socketClient;

    public AClass() {
        this.socketClient = SocketClient.getInstance();
    }
    
}