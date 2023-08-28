package com.melion.memento;

public class Test {
    public static void main(String[] args) {
        Editor editor = new Editor(Type.MP4, "THis is a video", "Design patterns");
        History history = new History();

        history.push(editor.saveState());

        editor.setContent("This is not a video");
        editor.setTitle("Photoshop");

        history.push(editor.saveState());

        editor.setContent("This is not a Image");
        editor.setTitle("Ilustarot");

        editor.undo(history.pop());
        editor.undo(history.pop());
        System.out.println(editor.toString());

    }
}
