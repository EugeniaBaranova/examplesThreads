package com.epam;


public class DataKeeper {

    private int i;

    public synchronized int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }


}
