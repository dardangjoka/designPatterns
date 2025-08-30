package com.melion.httpsServer.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class HttpConnectionWorkerThread extends Thread{
    private final static Logger LOGGER = LoggerFactory.getLogger(HttpConnectionWorkerThread.class);
    private final Socket socket;

    public HttpConnectionWorkerThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            LOGGER.info("Connection accepted " + socket.getInetAddress());
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();

            int byteArray;
            while((byteArray = inputStream.read()) >= 0){
                System.out.print((char) byteArray);
            }

            final String CRLF = "\n\r";
            final String SP = " ";

            String HTML = "<h1> Hello Server </h1>";

            String response = "HTTP/1.1 200 OK" + CRLF
                + "Content-length: " + HTML.getBytes().length + CRLF + CRLF
                + HTML + CRLF + CRLF;

            outputStream.write(response.getBytes());

        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            try {
                assert inputStream != null;
                inputStream.close();

                assert outputStream != null;
                outputStream.close();

                socket.close();
            } catch (IOException e) {
                LOGGER.error(e.getMessage());
            }
        }
    }

}
