package com.melion.state;

public enum VeglatEnum {
    LAPSI(new Lapsi()),
    GOMA(new Goma()),
    KOFJA(new Kofja());

    private Veglat veglat;
    public Veglat setValue(){
        return this.veglat;
    }
    VeglatEnum(Veglat veglat) {
        this.veglat = veglat;
    }
}
