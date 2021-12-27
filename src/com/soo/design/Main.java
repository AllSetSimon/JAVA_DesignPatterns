package com.soo.design;

import com.soo.design.adapter.*;
import com.soo.design.singleton.SocketClient;
import com.soo.design.singleton.TestA;
import com.soo.design.singleton.TestB;

public class Main {

    public static void main(String[] args) {
        /*
        TestA testA = new TestA();
        TestB testB = new TestB();

        SocketClient aClient = testA.getSocketClient();
        SocketClient bClient = testB.getSocketClient();

        System.out.println("Are they same object?");
        System.out.println(aClient.equals(bClient)); // true (객체의 동일성을 확일할 때는 Equals를 사용)
         */

        /*
        * 서로 비슷하지만 인터페이스가 맞지 않을 때는 Adapter를 통해서 변환
       * */

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

    }

    //콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
