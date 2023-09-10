package com.melion.state.shembulli03;

public class PanasonicRadio implements Radio{
    @Override
    public void volumeUp() {
        System.out.println("Panasoci volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Panasoci volume Down");

    }

    @Override
    public void channelUp() {
        System.out.println("Panasoci channel Up");

    }

    @Override
    public void channelDown() {
        System.out.println("Panasoci channel Up");

    }

    public void baseBoost(){
        System.out.println(" Base boost");
    }
}
