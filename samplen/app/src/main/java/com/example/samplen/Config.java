package com.example.samplen;

import java.util.concurrent.TimeUnit;

public class Config {
    private static String HOST="68.183.126.148";
    private static String PORT="3000";
    private static int TIMEOUT=10;
    private static TimeUnit TIMEOUTUNIT = TimeUnit.SECONDS;


    public static String getURL() {
        return "http://"+HOST+":"+PORT;
    }

    public static int getTIMEOUT() {
        return TIMEOUT;
    }

    public static TimeUnit getTIMEOUTUNIT() {
        return TIMEOUTUNIT;
    }
}

