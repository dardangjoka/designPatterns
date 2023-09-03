package com.melion.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class History {
    List<EditorState> editorStatesList = new ArrayList<>();

    public void push(EditorState state){
        editorStatesList.add(state);
    }

    public EditorState pop(){
        try {

            int lastCout = editorStatesList.size()-1;
            return editorStatesList.remove(lastCout);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Nuk ka ma gjendje \n" +e);
            return null;
        }

    }
}
