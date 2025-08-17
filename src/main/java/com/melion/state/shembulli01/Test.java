package com.melion.state.shembulli01;

public class Test {
    public static void main(String[] args) {

        PostMan postMan = new PostMan();
        Request request = new GetRequest();
        System.out.println(request);

        postMan.sendRequest(new PUTRequest(), "google.com", "UserName: Pajazit");
    }
}
