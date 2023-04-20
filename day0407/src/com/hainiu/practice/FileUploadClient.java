package com.hainiu.practice;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("D:\\壁纸\\微信图片_20221218132847.jpg");

        Socket socket = new Socket(InetAddress.getByName("localhost"),10086);

        OutputStream out = socket.getOutputStream();
        byte[] bytes = new byte[8192];
        int len;
        while ((len=in.read(bytes))!=-1){
            out.write(bytes,0,len);
            out.flush();
        }

        socket.shutdownOutput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String result = reader.readLine();
        System.out.println(result);

        in.close();
        socket.close();
    }
}
