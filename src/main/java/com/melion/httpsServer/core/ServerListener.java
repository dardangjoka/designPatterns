package com.melion.httpsServer.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
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
            while (serverSocket.isBound() && !serverSocket.isClosed()) {
                Socket socket = this.serverSocket.accept();
                HttpConnectionWorkerThread workerThread = new HttpConnectionWorkerThread(socket);
                workerThread.start();
            }
//            serverSocket.close(); TODO
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
        finally {
            if(serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage());
                }
            }
        }
    }
}
