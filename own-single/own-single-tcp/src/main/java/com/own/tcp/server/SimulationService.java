package com.own.tcp.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimulationService {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;

        try {
            serverSocket = new ServerSocket(8085);

            while (true) {
                socket = serverSocket.accept();
                inputStream = socket.getInputStream();
                dataInputStream = new DataInputStream(inputStream);
                String request = dataInputStream.readUTF();
                System.out.println("接收到了客户端请求信息: " + request);

                // 回复响应
                outputStream = socket.getOutputStream();
                dataOutputStream = new DataOutputStream(outputStream);
                String response = "Hello World!";
                dataOutputStream.writeUTF(response);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("---close---");
                serverSocket.close();
                socket.close();
                outputStream.close();
                inputStream.close();
                dataInputStream.close();
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
