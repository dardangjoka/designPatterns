package com.melion.state.shembulli01;

public class PostMan {
    //S -> Single Resposebility
    public void sendRequest(Request request, String URI, String body){
        request.send(URI, body);
    }

}
