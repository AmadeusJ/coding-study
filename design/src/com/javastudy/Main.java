package com.javastudy;

import com.javastudy.singleton.AClass;
import com.javastudy.singleton.BClass;
import com.javastudy.singleton.SocketClient;
import com.javastudy.adapter.*;

public class Main {
    public static void main(String[] args) {

        // Singletone
        AClass aClass = new AClass();
        BClass bClass = new BClass();

        SocketClient aClient = aClass.getSocketClient();
        SocketClient bClient = bClass.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));

        // Adapter

    }
}
