package com.melion.state.shembulli01;

public class PostMan {
    public void sendRequest(Request request, String URI, String body){
        request.send(URI, body);
    }
}
