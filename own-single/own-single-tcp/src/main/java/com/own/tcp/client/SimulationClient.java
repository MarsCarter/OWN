package com.own.tcp.client;

import java.io.*;
import java.net.Socket;

public class SimulationClient {
    //000b3330203338203333203332
    //A5A55A5AF430303031303030350101F80B000202

    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;

        try {
//            socket = new Socket("127.0.0.1" ,8085);
            socket = new Socket("47.99.34.52" ,8085);
            byte[] bytes = { (byte) 0xA5, (byte) 0xA5, 0x5A, 0x5A, (byte) 0xF4, 0x30, 0x30, 0x30, 0x31, 0x30, 0x30, 0x30, 0x35, 0x01, 0x01, (byte) 0xF8, 0x0B, 0x00, 0x02, 0x02 };

            //发送数据
            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.write(bytes);
            StringBuilder sb1 = new StringBuilder();
            for (byte b : bytes) {
                sb1.append(String.format("%02X", b));
            }
            System.out.println("服务端请求为： " +  sb1.toString());

            //接收数据
            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);
            StringBuilder sb2 = new StringBuilder();
            for(int i = 0; i <= bytes.length ; i++){
                sb2.append(String.format("%02X", dataInputStream.readByte()));
            }
            System.out.println("服务端响应为： " +  sb2.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                inputStream.close();
                dataInputStream.close();
                dataOutputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static String byteArrayToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }

}
