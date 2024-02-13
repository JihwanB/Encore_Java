package com.encore.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerMain {

    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        BufferedReader br = null;

        try {
            server = new ServerSocket(7777);
            System.out.println("Server Socket Ready.....");
            while (true) {
                socket = server.accept();
                System.out.println(socket.getRemoteSocketAddress() + "에서 접속됨");
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                new Thread(new SocketServerThread(br, socket)).start();
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "님이 퇴장하셨습니다.");
        } finally {
            try {
                if (br != null) br.close();
                if (socket != null) socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
