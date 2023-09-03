package com.melion.memento;

public class Test {
    public static void main(String[] args) {
        //State1
        Editor editor = new Editor(Type.MP4, "Bethoven","Moonlight Sonate");
        History history = new History();

        var eitorState1 = editor.saveState(); // U kriju ni editor state 1
        history.push(eitorState1);     // U rujt qajo editor state

        //State 2
        editor.setContent("For Elize");
        editor.setType(Type.AVI);

        EditorState editorState2 = editor.saveState(); // E kem kruju ni state
        history.push(editorState2);  // e kemi rujt gjendjen

        //State 3
        editor.setType(Type.GIF);
        editor.setContent("Mozart");
        editor.setTitle("requirum");

        EditorState editorState3 = editor.saveState();
        history.push(editorState3);

        editor.undo(history.pop());
        editor.undo(history.pop());
        editor.undo(history.pop());
        editor.undo(history.pop());

        // SOLID-> S-> Single responsebility
        System.out.println(editor.toString());

    }
}
