package com.hainiu.practice;


import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ServersDemo {
    public static void main(String[] args) throws Exception {
        int port = 7777;
        DatagramSocket socket = new DatagramSocket(port);

        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

        while (true) {
            socket.receive(packet);

            int len = packet.getLength();
            String s =new String(bytes,0,len);
            String ip = packet.getAddress().getHostAddress();
            System.out.println(ip+"说："+s);
        }

//        socket.close();
    }
}
