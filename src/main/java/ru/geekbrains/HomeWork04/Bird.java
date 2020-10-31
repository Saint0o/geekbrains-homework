package ru.geekbrains.HomeWork04;

public class Bird extends Participant implements Flyable, Runnable {
    protected Bird(String name, int flight, int length) {
        super(name);
        setMaxFlight(flight);
        setMaxRun(length);
    }

    @Override
    public void setMaxFlight(int flight) {
        super.maxFly = flight;
    }

    @Override
    public void setMaxRun(int maxRun) {
        super.maxRun = maxRun;
    }
}
