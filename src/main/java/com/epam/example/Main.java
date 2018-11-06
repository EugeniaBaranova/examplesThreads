package com.epam.example;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Thread> threadList = new ArrayList<Thread>();

        DataKeeper dataKeeper = new DataKeeper();
        dataKeeper.setI(1);

        for (int j = 1; j < 100; j++) {
            CountRunner countRunner = new CountRunner(dataKeeper);
            Thread firstThread = new Thread(countRunner);
            firstThread.start();
            threadList.add(firstThread);
        }
        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println(dataKeeper.getI());


    }


}
