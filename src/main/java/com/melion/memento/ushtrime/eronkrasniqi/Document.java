package com.melion.memento.ushtrime.eronkrasniqi;

import javax.print.Doc;
import java.util.Deque;
import java.util.LinkedList;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;
    public Memento takeSnapshot(){
        return new Memento(this.content,this.fontName,this.fontSize);
    }
    public void restoreContent(Memento memento){
        this.content= memento.getContent();
    }
    public void restoreFontName(Memento memento){
        this.fontName= memento.getFontName();
    }
    public void restoreFontSize(Memento memento){
        this.fontSize= memento.getFontSize();
    }

    public void setContent(String content){
        this.content = content;
    }
    public void setFontName(String fontName){
        this.fontName = fontName;
    }
    public void setFontSize(int fontSize){
        this.fontSize = fontSize;
    }

    public static class Memento{
        private String content;
        private String fontName;
        private int fontSize;
        private Memento(String savedContent, String savedFontName, int savedFontSize){
            content = savedContent;
            fontName = savedFontName;
            fontSize = savedFontSize;
        }
        String getContent(){
            return content;
        }
        String getFontName(){
            return fontName;
        }
        int getFontSize(){
            return fontSize;
        }
    }
    @Override
    public String toString() {
        return "Content: " + content + "\nFont Name: " + fontName + "\nFont Size: " + fontSize;
    }
}
