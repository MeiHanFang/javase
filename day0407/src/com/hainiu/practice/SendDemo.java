package com.hainiu.practice;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws Exception {
        //码头
        DatagramSocket socket = new DatagramSocket();

        String s = "一起拉屎吗";
        byte[] bytes = s.getBytes();
        InetAddress byName = InetAddress.getByName("192.168.62.196");
        int port = 10086;
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,byName,port);

        socket.send(packet);

        socket.close();
    }
}
