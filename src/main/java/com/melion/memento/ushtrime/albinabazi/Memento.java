package com.melion.memento.ushtrime.albinabazi;

public class Memento {
    private String permbajtaR;
    private String stiliIShkronjaveR;
    private int permasaEShkronjaveR;

    public Memento(String permbajtaR, String stiliIShkronjaveR, int permasaEShkronjaveR) {
        this.permbajtaR = permbajtaR;
        this.stiliIShkronjaveR = stiliIShkronjaveR;
        this.permasaEShkronjaveR = permasaEShkronjaveR;
    }

    public String getPermbajtaR() {
        return permbajtaR;
    }

    public String getStiliIShkronjaveR() {
        return stiliIShkronjaveR;
    }

    public int getPermasaEShkronjaveR() {
        return permasaEShkronjaveR;
    }
}