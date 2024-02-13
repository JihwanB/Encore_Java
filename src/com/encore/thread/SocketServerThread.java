package com.encore.thread;

import java.io.BufferedReader;
import java.net.Socket;

public class SocketServerThread implements Runnable {

    private BufferedReader br;
    private Socket socket;

    public SocketServerThread() {

    }

    public SocketServerThread(BufferedReader br, Socket socket) {
        this.br = br;
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String msg = br.readLine();
                System.out.println("from " + socket.getRemoteSocketAddress() + ">> " + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
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
