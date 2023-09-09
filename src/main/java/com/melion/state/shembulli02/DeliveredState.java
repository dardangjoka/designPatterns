package com.melion.state.shembulli02;

public class DeliveredState implements PackageState{
    private final static String STATE =" THIS IS THE DELIVERED STATE";
    @Override
    public void next(Package pkg){
        System.out.println("Package Has Been Delivered");
    }
    @Override
    public void prev(Package pkg){
        pkg.setState(new AcceptedState());
    }
    @Override
    public void printStatus(Package pkg){
        System.out.println(STATE + " "+ pkg);
    }
}
