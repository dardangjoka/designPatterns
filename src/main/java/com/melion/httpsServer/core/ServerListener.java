package com.melion.httpsServer.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener extends Thread {

    private final static Logger LOGGER = LoggerFactory.getLogger(ServerListener.class);
    private ServerSocket serverSocket;
    private int port;
    private String webRoot;

    public ServerListener(int port, String webRoot) throws IOException {
       this.port = port;
       this.webRoot = webRoot;
       this.serverSocket = new ServerSocket(this.port);
    }

    @Override
    public void run() {
        try {

            Socket socket = this.serverSocket.accept();
            LOGGER.info("Connection accepted " + socket.getInetAddress());
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream  = socket.getOutputStream();

            final String CRLF = "\n\r";
            String HTML = "<h1> Hello Server </h1>";

            String response = "HTTP/1.1 200 OK" + CRLF
                    +"Content-length: " + HTML.getBytes().length + CRLF + CRLF
                    + HTML + CRLF + CRLF;

            outputStream.write(response.getBytes());

//            inputStream.close();
//            output
//            socket.close();
//            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
