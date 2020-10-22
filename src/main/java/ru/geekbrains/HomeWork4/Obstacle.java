package ru.geekbrains.HomeWork4;

public abstract class Obstacle {
    private final String NAME;

    protected Obstacle(String name) {
        NAME = name;
    }

    public abstract boolean pass(Participant participant);
}
