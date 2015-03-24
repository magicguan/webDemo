package com.sunday.webDemo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * function description.
 * <p><h2>Change History</h2>
 * 2015/3/24 | G | created
 * </p>
 *
 * @author G
 * @version 1.0.0
 */
@Component
public class TestJob {
    @Scheduled(cron = "02/5 * * * * ?")
    public void doSomething() throws InterruptedException {
        System.out.println("job begin...");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000L);
//            System.out.println("job ..." + i);
        }
        System.out.println("job end...");
    }

    @Scheduled(cron = "00/5 * * * * ?")
    public void doSomething2() throws InterruptedException {
        System.out.println("job2 begin...");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000L);
//            System.out.println("job2 ..." + i);
        }
        System.out.println("job2 end...");
    }

}
