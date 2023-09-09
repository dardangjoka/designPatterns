package com.melion.state.shembulli01;

public class DeleteRequest implements Request{
    @Override
    public void send(String URI, String body){
        System.out.println("Deleteing data from " + URI);
    }



}
