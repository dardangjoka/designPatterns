package com.melion.state.shembulli01;

public class GetRequest implements Request{
    @Override
    public void send(String URI, String body){
        System.out.println("Reading Data from " + URI);
    }

    public void getMethod(){
        System.out.println("kjo eshte vetem per get");
    }
}
