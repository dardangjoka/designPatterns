package com.melion.memento.ushtrime.albinabazi;

import java.util.LinkedList;
import java.util.Queue;

public class Document {

    private String permbajta;
    private String stiliIShkronjave;
    private int permasaEShkronjave;
    private Queue<Memento> mementos = new LinkedList<>();

    public Memento createMemento(){
        return new Memento(permbajta, stiliIShkronjave, permasaEShkronjave);
    }

    public void rikthePrejMemento(Memento memento){
        this.permbajta = memento.getPermbajtaR();
        this.stiliIShkronjave = memento.getStiliIShkronjaveR();
        this.permasaEShkronjave = memento.getPermasaEShkronjaveR();
    }

    public void ndryshoPermbajtjen(String permbajtja){
        this.permbajta = permbajtja;
        mementos.offer(createMemento());
    }

    public void ndryshostiliIShkronjave(String stiliIShkronjave){
        this.stiliIShkronjave = stiliIShkronjave;
        mementos.offer(createMemento());
    }

    public void ndryshoPermasaEShkronjave(int permasaEShkronjave){
        this.permasaEShkronjave = permasaEShkronjave;
        mementos.offer(createMemento());
    }

    public void undu() {
            // Check if there are any mementos in the queue
        if (!mementos.isEmpty()) {
            // Remove the last memento from the queue
            Memento previousMemento = mementos.poll();
            
            // Check if there is another memento in the queue
            if (!mementos.isEmpty()) {
                // Get the last memento without removing it (peek)
                Memento currentMemento = mementos.peek();
                
                // Restore the document's state from the last memento
                rikthePrejMemento(currentMemento);
        
                // Print the document's state after undo
                System.out.println("Undoing last change:");
                System.out.println("Content: " + permbajta);
                System.out.println("Font Name: " + stiliIShkronjave);
                System.out.println("Font Size: " + permasaEShkronjave);
            } else {
                System.out.println("No more changes to undo.");
            }
        } else {
            System.out.println("No more changes to undo.");
        }
    }

    public void printoDocumentin(){
        System.out.println("Last change:");
        System.out.println("Content: " + permbajta);
        System.out.println("Font Name: " + stiliIShkronjave);
        System.out.println("Font Size: " + permasaEShkronjave);
    }

}
