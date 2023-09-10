package com.melion.state.shembulli03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       var chicken = new Chicken();

        Set<String> arr = new HashSet<>();
        arr.add("e");
        arr.add("f");
        arr.add("l");

        Iterator<String> iterator = arr.iterator();

        while (iterator.hasNext()){
            System.out.printf(iterator.next());
        }
    }
}
