package ru;

public class SheduleTask implements Runnable {
    private TakeBody take = new TakeBody("https://gturnquist-quoters.cfapps.io/api/random");
    @Override
    public void run() {
        System.out.println(take.get());
    }
}
