package com.sunday.webDemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

/**
 * function description.
 * <p><h2>Change History</h2>
 * 2015/3/24 | G | created
 * </p>
 *
 * @author G
 * @version 1.0.0
 */
@Configuration
@EnableScheduling
public class MySchedulingConfigurer implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(10));
    }
}
