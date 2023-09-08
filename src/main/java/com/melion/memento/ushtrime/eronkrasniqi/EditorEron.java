package com.melion.memento.ushtrime.eronkrasniqi;

import javax.print.Doc;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PrimitiveIterator;

public class EditorEron {
    private Deque<Document.Memento> stateHistory;
    private Document document;
    public EditorEron(){
        stateHistory = new LinkedList<>();
        document = new Document();
    }
    public void writeContent(String content){
        document.setContent(content);
        stateHistory.add(document.takeSnapshot());
    }
    public void changeFontName(String fontName){
        document.setFontName(fontName);
        stateHistory.add(document.takeSnapshot());
    }
    public void changeFontSize(int fontSize){
        document.setFontSize(fontSize);
        stateHistory.add(document.takeSnapshot());
    }

    public void undo(){
        document.restoreContent(stateHistory.pop());
        document.restoreFontName(stateHistory.pop());
        document.restoreFontSize(stateHistory.pop());
    }
    public String getDocumentInfo() {
        return document.toString();
    }
}
