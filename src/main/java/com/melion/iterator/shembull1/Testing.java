package com.melion.iterator.shembull1;

public class Testing {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.push("google.com");
        browserHistory.push("hianime.com");
        browserHistory.push("youtube.com");

        Iterator<String> iterator = browserHistory.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
