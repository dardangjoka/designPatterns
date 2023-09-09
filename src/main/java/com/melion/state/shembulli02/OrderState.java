package com.melion.state.shembulli02;

public class OrderState implements PackageState{
    @Override
    public void next(Package pkg){
        pkg.setState(new AcceptedState());
    }
    @Override
    public void prev(Package pkg){
        System.out.println(" This is the first Staet");
    }
    @Override
    public void printStatus(Package pkg){
        System.out.println("This has been ordered  " + pkg);
    }
}
