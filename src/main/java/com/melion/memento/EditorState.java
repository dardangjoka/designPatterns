package com.melion.memento;

public class EditorState {
    private Editor editor; // Compostion

    public EditorState(Editor editor){
        this.editor = editor;
    } // dependency

    public String getTitle(){
        return editor.getTitle();
    }

    public String getContent(){
        return editor.getContent();
    }
    public Type getType(){
        return editor.getType();
    }

    //SOLID principles-> Single principle
}
