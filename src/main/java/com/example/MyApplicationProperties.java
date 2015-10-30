package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("example.properties")
public class MyApplicationProperties {

    private long fixedScheduleRate = 2000;

    public MyApplicationProperties() {
    }

    public long getFixedScheduleRate() {
        return fixedScheduleRate;
    }

    public void setFixedScheduleRate(long fixedScheduleRate) {
        this.fixedScheduleRate = fixedScheduleRate;
    }
}