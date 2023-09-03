package com.melion.state;

public class Test {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        canvas.clickHandler(new Lapsi());

        canvas.clickHandler(new Brush());
    }
}
