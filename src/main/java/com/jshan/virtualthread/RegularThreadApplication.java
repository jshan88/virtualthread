package com.jshan.virtualthread;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RegularThreadApplication {

    public static void main(String[] args) throws InterruptedException {
//        int multiCount = 1000;
//
//        ExecutorService executorService = Executors.newScheduledThreadPool(multiCount);
//        CountDownLatch countDownLatch = new CountDownLatch(multiCount);
//
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i < multiCount; i++) {
//            executorService.execute(() -> {
//                for(int j = 0; j < multiCount; j++) {
//                    System.out.println("Regular Thread");
//                }
//                countDownLatch.countDown();
//            });
//        }
//
//        countDownLatch.await();
//        System.out.printf("Elapsed Time for Regular Thread : : %dms", System.currentTimeMillis() - startTime);
    }
}
//3646ms
