package com.melion.iterator.shembull1;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private Iterator<String> iterator;
    private List<String> urls = new ArrayList<>();

    public BrowserHistory(){
        iterator = new ListIterator<>(urls);
    }
    public void push(String url){
        this.urls.add(url);
    }
    public String pop(){
        int last = urls.size() - 1;
        return urls.remove(last);
    }

    public Iterator createIterator(){
        return iterator;
    }
}
