package com.melion.state.shembulli02;

public interface PackageState {
    void next(Package pkg);

    void prev(Package pkg);

    void printStatus(Package pkg);
}
