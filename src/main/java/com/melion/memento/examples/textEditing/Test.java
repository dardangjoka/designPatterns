package com.melion.memento.examples.textEditing;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileEditor fileEditor = new FileEditor("newFile1.txt");
        fileEditor.createFile();
        fileEditor.writeToFile("hello world \n");
        System.out.println(fileEditor.getFileData());
    }
}
