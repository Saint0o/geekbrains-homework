package ru.geekbrains.HomeWork04;

public abstract class Obstacle {
    private final String name;

    protected Obstacle(String name) {
        this.name = name;
    }

    public abstract boolean pass(Participant participant);
}
