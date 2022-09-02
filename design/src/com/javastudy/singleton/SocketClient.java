package com.javastudy.singleton;

public class SocketClient {
    private static SocketClient socketClient = null;

    // Default 생성새를 private 으로 막아 해당 Class 에서만 생성되도록..
    private SocketClient() {

    }

    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
