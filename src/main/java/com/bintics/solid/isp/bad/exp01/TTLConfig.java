package com.bintics.solid.isp.bad.exp01;

public class TTLConfig {

    private long time;
    private int retires;

    public TTLConfig(long time, int retries) {
        this.time = time;
        this.retires = retries;
    }

}
