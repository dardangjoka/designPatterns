package com.melion.iterator.shembull1;

import java.util.List;

public class ListIterator<T> implements Iterator<T>{
    private List<T> elements;
    private int index = 0;

    public ListIterator(List<T> list){
        elements = list;
    }
    @Override
    public boolean hasNext() {
        return (index < elements.size());
    }

    @Override
    public T current() {
        return elements.get(index);
    }

    @Override
    public void next() {
        index ++;
    }
}
