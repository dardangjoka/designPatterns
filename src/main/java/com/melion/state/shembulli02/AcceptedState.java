package com.melion.state.shembulli02;

public class AcceptedState implements PackageState{

    private final static String STATE =" THIS IS THE ACCEPTED STATE";
    @Override
    public void next(Package pkg){
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg){
        pkg.setState(new OrderState());
    }
    @Override
    public void printStatus(Package pkg){
        System.out.println(STATE + " " + pkg);
    }


}
