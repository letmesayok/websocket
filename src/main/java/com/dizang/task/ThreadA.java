package com.dizang.task;

import com.dizang.websocket.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;

public class ThreadA implements Runnable{
    boolean stopMe = true;
    public void stopMe() {
        stopMe = false;
    }
    public void run() {
        while(stopMe) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            WebSocket webSocket = new WebSocket();
            webSocket.onMessage(1);
        }
    }
}
