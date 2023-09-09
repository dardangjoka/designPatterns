package com.melion.state.shembulli01;

public class Test {
    public static void main(String[] args) {
        PostMan postMan = new PostMan();
        postMan.sendRequest(new PostRequest(), "google.com", "UserName: Pajazit");
    }
}
