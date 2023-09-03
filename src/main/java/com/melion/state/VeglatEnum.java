package com.melion.state;

public enum VeglatEnum {
    LAPSI(new Lapsi()),
    GOMA(new Goma()),
    KOFJA(new Kofja());

    private Veglat veglat;
    VeglatEnum(Veglat veglat) {
        this.veglat = veglat;
    }
}
