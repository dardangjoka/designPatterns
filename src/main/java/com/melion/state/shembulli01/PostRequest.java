package com.melion.state.shembulli01;

import java.net.URI;

public class PostRequest implements Request{
    @Override
    public void send(String URI, String body){
        System.out.println("creating Data from " + URI + " Using " + body + "As data");
    }
}
