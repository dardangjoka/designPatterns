package com.melion.iterator.gabim;

public class Main {
    public static void main(String[] args) {
        Browserhistory bh = new Browserhistory();

        bh.push("Google.com");
        bh.push("hianime.com");
        bh.push("youtube.com");

        for (int i = 0; i <bh.getUrls().size() ; i++) {
            System.out.println(bh.getUrls().get(i));
        }
    }
}
