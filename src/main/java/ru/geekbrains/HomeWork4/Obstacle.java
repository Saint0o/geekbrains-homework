package ru.geekbrains.HomeWork4;

public abstract class Obstacle {
    private final String name;

    protected Obstacle(String name) {
        this.name = name;
    }

    public abstract boolean pass(Participant participant);
}
