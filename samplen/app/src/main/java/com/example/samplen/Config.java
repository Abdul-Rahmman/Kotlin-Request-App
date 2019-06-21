package com.example.samplen;

import java.util.concurrent.TimeUnit;

public class Config {
    private static String HOST="192.168.43.58";
    private static String PATH = "samplen";
    private static String PORT="80";
    private static int TIMEOUT=10;
    private static TimeUnit TIMEOUTUNIT = TimeUnit.SECONDS;


    public static String getURL() {
        return "http://"+HOST+":"+PORT+"/"+PATH+"/";
    }

    public static int getTIMEOUT() {
        return TIMEOUT;
    }

    public static TimeUnit getTIMEOUTUNIT() {
        return TIMEOUTUNIT;
    }
}

