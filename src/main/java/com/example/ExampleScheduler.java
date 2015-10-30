package com.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExampleScheduler {

    public ExampleScheduler() {
    }

    @Scheduled(fixedRateString = "#{myApplicationProperties.fixedScheduleRate}")
    private void doSomething(){
        System.out.println("something");
    }
}
