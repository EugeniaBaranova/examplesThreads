package com.epam;

public class CountRunner implements Runnable {
    private DataKeeper dataKeeper;

    public void run() {

        int keeperI = dataKeeper.getI();
        int newI = ++keeperI;
        dataKeeper.setI(newI);
    }

    public CountRunner(DataKeeper dataKeeper) {
        this.dataKeeper = dataKeeper;
    }



}
