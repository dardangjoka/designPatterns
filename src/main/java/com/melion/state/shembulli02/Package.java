package com.melion.state.shembulli02;


public class Package {
    private PackageState state;
    boolean isAdmin = false;

    public void setState(PackageState state) {
        if(isAdmin)
        this.state = state;
        else
            throw  new RuntimeException("THis user is not validated or is not an admin");
    }

    public void previousState(){
        state.prev(this);
    }

    public void nextState(){
        state.next(this);
    }

    public void printStatus(){
        state.printStatus(this);
    }
}
