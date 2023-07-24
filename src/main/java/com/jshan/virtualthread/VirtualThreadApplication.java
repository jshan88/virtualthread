package com.jshan.virtualthread;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VirtualThreadApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(VirtualThreadApplication.class, args);
//        int multiCount = 1000;
//
//        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
//        CountDownLatch countDownLatch = new CountDownLatch(multiCount);
//
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i < multiCount; i++) {
//            executorService.execute(() -> {
//                for(int j = 0; j < multiCount; j++) {
//                    System.out.println("Virtual Thread");
//                }
//                countDownLatch.countDown();
//            });
//        }
//
//        countDownLatch.await();
//        System.out.printf("Elapsed Time for Virtual Thread : : %dms", System.currentTimeMillis() - startTime);
    }
}
