package com.epam;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();



        DataKeeper dataKeeper = new DataKeeper();
        dataKeeper.setI(1);

        for (int j = 1; j < 100; j++) {
            CountRunner countRunner = new CountRunner(dataKeeper);

            service.submit(countRunner);
        }



        System.out.println(dataKeeper.getI());


    }


}
