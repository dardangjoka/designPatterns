package com.melion.state.shembulli03;

public class SonyRadio implements Radio{
    @Override
    public void volumeUp() {
        System.out.println("Sony volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Sony volume Down");

    }

    @Override
    public void channelUp() {
        System.out.println("Sony channel Up");

    }

    @Override
    public void channelDown() {
        System.out.println("Sony channel Up");

    }
}
