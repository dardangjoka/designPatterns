package com.melion.iterator.gabim;

import java.util.ArrayList;
import java.util.List;

public class Browserhistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        int last = urls.size()-1;
        return urls.remove(last);
    }

    public List<String> getUrls() {
        return urls;
    }
}
