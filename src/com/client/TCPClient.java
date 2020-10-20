package com.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main (String[] args) throws IOException {
        String name = "localhost";
        int port = 3333;
        Socket socket = new Socket(name, port);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
    }
}
