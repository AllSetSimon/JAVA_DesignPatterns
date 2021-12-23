package com.soo.design.singleton;

public class SocketClient {

    /**
     * 싱글톤 패턴은 어떤 클래스가 유일하게 1개만 존재할 때 사용
     * Ex. Printer
     * Ex. TCP Socket (서로 자원을 공유하는 경우 자주 사용)
     */

    private static SocketClient socketClient = null; // 싱글톤은 자기자신을 객체변수로 가지고 있어야 한다

    private SocketClient(){

    } // 싱글톤은 private으로 디폴트 생성자를 막아야만 한다.

    public static SocketClient getInstance(){ // getInstance로 호출 시

        if(socketClient == null){
            socketClient = new SocketClient();
        } // 없다면 소켓클라를 생성할 것이고

        return socketClient; // 있으면 바로 리턴턴

    }

    public void connect(){
        System.out.println("connect");
    }

}
