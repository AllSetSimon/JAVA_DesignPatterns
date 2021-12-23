package com.soo.design;

import com.soo.design.singleton.SocketClient;
import com.soo.design.singleton.TestA;
import com.soo.design.singleton.TestB;

public class Main {

    public static void main(String[] args) {
        TestA testA = new TestA();
        TestB testB = new TestB();

        SocketClient aClient = testA.getSocketClient();
        SocketClient bClient = testB.getSocketClient();

        System.out.println("Are they same object?");
        System.out.println(aClient.equals(bClient)); // true (객체의 동일성을 확일할 때는 Equals를 사용)
    }
}
