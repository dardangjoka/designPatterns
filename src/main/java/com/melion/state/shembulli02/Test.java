package com.melion.state.shembulli02;

public class Test {
    public static void main(String[] args) {
        Package pkg1 = new Package();
        pkg1.setState(new OrderState());
        pkg1.printStatus();

        pkg1.nextState();
        pkg1.printStatus();

        pkg1.previousState();
        pkg1.printStatus();
        System.out.println(" =========================================================");
        Package pkg2 = new Package();
        pkg2.printStatus();
        pkg2.nextState();

        pkg2.printStatus();
        pkg2.nextState();

        pkg2.printStatus();
        pkg2.nextState();
    }
}
