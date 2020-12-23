package com.maven.multithread.CyclicBarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Packagename com.maven.multithread.CyclicBarrier
 * @Classname HorseRace
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/12/14 15:36
 * @Version 1.0
 */
public class HorseRace implements Runnable {

    private static final int FINISH_LINE = 100;
    private static List<Horse> horses = new ArrayList<>();
    private static ExecutorService executorService = Executors.newCachedThreadPool();

    @Override
    public void run() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < FINISH_LINE; i++) {
            stringBuilder.append("=");
        }
        System.out.println(stringBuilder.toString());
        for (Horse horse : horses) {
            System.out.println(horse.track());
            if (horse.getStrides() >= FINISH_LINE) {
                System.out.println(horse + "WON!");
                executorService.shutdownNow();
                return;
            }
        }

    }


    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(7, new HorseRace());
        for (int i = 0; i < 7; i++) {
            Horse horse = new Horse(barrier);
            horses.add(horse);
            executorService.execute(horse);
        }
    }
}
