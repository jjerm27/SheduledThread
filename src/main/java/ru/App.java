package ru;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.*;

public class App
{
    public static void main( String[] args ) {
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(new SheduleTask(),0,30,SECONDS);

    }
}
