package com.melion;

import com.melion.memento.ushtrime.eronkrasniqi.EditorEron;

public class Main {
    public static void main(String[] args) {
        EditorEron editor= new EditorEron();
        System.out.println("Original Document:");
        editor.writeContent("Original content");
        editor.changeFontName("Sego UI");
        editor.changeFontSize(12);
        System.out.println(editor.getDocumentInfo());

        // Make changes and allow undo
        editor.writeContent("Updated content");
        editor.changeFontName("Times New Roman");
        editor.changeFontSize(14);

        System.out.println("\nDocument after changes:");
        System.out.println(editor.getDocumentInfo());

        // Undo changes
        editor.undo();
        System.out.println("\nDocument after undo:");
        System.out.println(editor.getDocumentInfo());
    }
}
